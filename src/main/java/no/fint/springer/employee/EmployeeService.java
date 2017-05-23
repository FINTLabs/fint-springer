package no.fint.springer.employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeService extends MongoRepository<Employee, String> {
}