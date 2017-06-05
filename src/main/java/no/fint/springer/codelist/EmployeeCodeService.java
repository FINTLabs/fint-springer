package no.fint.springer.codelist;

import no.fint.springer.employee.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "employeecodes", path = "employeecodess")
public interface EmployeeCodeService extends MongoRepository<Employeecode, String> {
}