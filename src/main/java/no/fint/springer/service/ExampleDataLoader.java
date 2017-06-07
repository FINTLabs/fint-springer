package no.fint.springer.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import no.fint.springer.codelist.*;
import no.fint.springer.employee.Employee;
import no.fint.springer.employment.Employment;
import no.fint.springer.human.Human;
import no.fint.springer.organisation.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Slf4j
@Service
public class ExampleDataLoader {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    ObjectMapper objectMapper;

    private ResourceLoader resourceLoader;

    //@PostConstruct
    public void init() throws IOException, URISyntaxException {
        mongoTemplate.getDb().dropDatabase();

        /*
        File[] files = new File(ClassLoader.getSystemResource("data").toURI()).listFiles();

        Arrays.stream(files).forEach(file -> {
            String resourceName = file.getName().split("\\.")[0];
            try {
                loadResources(resourceName);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });
        */

        loadResourcesHuman();
        loadResourcesEmployee();
        loadResourcesEmployment();
        loadResourcesOrganisation();
        loadResourcesEmployeecode();
        loadResourcesEmployeementtype();
        loadResourcesFunctioncode();
        loadResourcesHoursperweekcode();
        loadResourcesPersonalresourcecategory();
        loadResourcesResponsibilitycode();

    }

    private void loadResourcesResponsibilitycode() throws URISyntaxException, IOException {
        Collection<ResponsibilityCode> responsibilityCodes = objectMapper.readValue(getFile(String.format("responsibilitycode.json")), new TypeReference<List<ResponsibilityCode>>() {
        });

        mongoTemplate.insert(responsibilityCodes, "responsibilitycode");
        log.info("Loading '{}' example data", "responsibilitycode");
    }

    private void loadResourcesPersonalresourcecategory() throws URISyntaxException, IOException {
        Collection<PersonalResourceCategory> personalResourceCategories = objectMapper.readValue(getFile(String.format("personalresourcecategory.json")), new TypeReference<List<PersonalResourceCategory>>() {
        });

        mongoTemplate.insert(personalResourceCategories, "personalresourcecategory");
        log.info("Loading '{}' example data", "personalresourcecategory");
    }

    private void loadResourcesHoursperweekcode() throws URISyntaxException, IOException {
        Collection<HoursPerWeekCode> hoursPerWeekCodes = objectMapper.readValue(getFile(String.format("hoursperweekcode.json")), new TypeReference<List<HoursPerWeekCode>>() {
        });

        mongoTemplate.insert(hoursPerWeekCodes, "hoursperweekcode");
        log.info("Loading '{}' example data", "hoursperweekcode");
    }

    private void loadResourcesFunctioncode() throws URISyntaxException, IOException{
        Collection<FunctionCode> functionCodes = objectMapper.readValue(getFile(String.format("functioncode.json")), new TypeReference<List<FunctionCode>>() {
        });

        mongoTemplate.insert(functionCodes, "functioncode");
        log.info("Loading '{}' example data", "functioncode");
    }

    private void loadResourcesEmployeementtype() throws URISyntaxException, IOException{
        Collection<EmployeementType> employeementTypes = objectMapper.readValue(getFile(String.format("employeementtype.json")), new TypeReference<List<EmployeementType>>() {
        });

        mongoTemplate.insert(employeementTypes, "employeementtype");
        log.info("Loading '{}' example data", "employeementtype");
    }

    private void loadResourcesEmployeecode() throws URISyntaxException, IOException{
        Collection<Employeecode> employeecodes = objectMapper.readValue(getFile(String.format("employeecode.json")), new TypeReference<List<Employeecode>>() {
        });

        mongoTemplate.insert(employeecodes, "employeecode");
        log.info("Loading '{}' example data", "employeecode");
    }

    private void loadResourcesOrganisation() throws URISyntaxException, IOException{
        Collection<Organisation> organisations = objectMapper.readValue(getFile(String.format("organisation.json")), new TypeReference<List<Organisation>>() {
        });

        mongoTemplate.insert(organisations, "organisation");
        log.info("Loading '{}' example data", "organisation");
    }

    private void loadResourcesEmployment() throws URISyntaxException, IOException{
        Collection<Employment> employments = objectMapper.readValue(getFile(String.format("employment.json")), new TypeReference<List<Employment>>() {
        });

        mongoTemplate.insert(employments, "employment");
        log.info("Loading '{}' example data", "employment");
    }

    private void loadResourcesEmployee() throws URISyntaxException, IOException{
        Collection<Employee> employees = objectMapper.readValue(getFile(String.format("employee.json")), new TypeReference<List<Employee>>() {
        });

        mongoTemplate.insert(employees, "employee");
        log.info("Loading '{}' example data", "employee");
    }

    private void loadResourcesHuman() throws URISyntaxException, IOException{
        Collection<Human> humans = objectMapper.readValue(getFile(String.format("human.json")), new TypeReference<List<Human>>() {
        });

        mongoTemplate.insert(humans, "human");
        log.info("Loading '{}' example data", "Human");
    }



    private File getFile(String file) throws URISyntaxException {
        URL resource = ExampleDataLoader.class.getResource(String.format("/data/%s", file));
        return new File(resource.toURI());
    }


}
