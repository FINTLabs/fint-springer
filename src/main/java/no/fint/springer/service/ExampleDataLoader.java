package no.fint.springer.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import no.fint.springer.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.List;

@Slf4j
@Service
public class ExampleDataLoader {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void init() throws IOException, URISyntaxException {
        mongoTemplate.getDb().dropDatabase();
        loadResources();
    }

    private void loadResources() throws IOException {
        Resource[] resources = getResources();
        for (Resource resource : resources) {
            List<LinkedHashMap> values = getValuesFromFile(resources[0]);
            String collectionName = getCollectionName(resource);
            try {
                Class<?> collectionClass = getCollectionClass(collectionName);
                values.forEach(value -> insertModelValue(collectionName, collectionClass, value));
                log.info("Loaded '{}' example data", collectionName);
            } catch (ClassNotFoundException e) {
                log.warn("Skipping insert into {}, model missing", collectionName);
            }
        }
    }

    public Resource[] getResources() throws IOException {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(this.getClass().getClassLoader());
        return resolver.getResources("classpath*:data/*.json");
    }

    private List<LinkedHashMap> getValuesFromFile(Resource resource) throws IOException {
        return objectMapper.readValue(resource.getFile(), new TypeReference<List<LinkedHashMap>>() {
        });
    }

    private String getCollectionName(Resource resource) {
        return resource.getFilename().replace(".json", "");
    }

    private void insertModelValue(String collectionName, Class<?> clazz, LinkedHashMap value) {
        Object obj = objectMapper.convertValue(value, clazz);
        mongoTemplate.insert(obj, collectionName);
    }

    private Class<?> getCollectionClass(String collectionName) throws ClassNotFoundException {
        try {
            return getClass(collectionName);
        } catch (ClassNotFoundException e) {
            return getCodelistClass(collectionName);
        }
    }

    private Class<?> getClass(String collectionName) throws ClassNotFoundException {
        String basePackage = Application.class.getPackage().getName();
        return Class.forName(String.format("%s.%s.%s", basePackage, collectionName, StringUtils.capitalize(collectionName)));
    }

    private Class<?> getCodelistClass(String collectionName) throws ClassNotFoundException {
        String basePackage = Application.class.getPackage().getName();
        return Class.forName(String.format("%s.codelist.%s", basePackage, StringUtils.capitalize(collectionName)));
    }

}
