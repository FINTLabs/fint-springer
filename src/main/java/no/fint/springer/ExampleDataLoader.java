package no.fint.springer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class ExampleDataLoader {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void init() {
        mongoTemplate.getDb().dropDatabase();
        SpringerData springerData = new SpringerData();
        Map<String, List<?>> collections = springerData.getCollections();
        collections.keySet().forEach(key -> {
            List<?> values = collections.get(key);
            mongoTemplate.insert(values, key);
        });
    }

}
