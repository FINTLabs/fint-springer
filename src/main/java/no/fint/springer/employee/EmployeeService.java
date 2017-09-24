package no.fint.springer.employee;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.EMPLOYEES, path = Resources.EMPLOYEES)
public interface EmployeeService extends MongoRepository<Employee, String> {
}