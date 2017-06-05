package no.fint.springer.codelist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "employeecodes", path = "employeecodes")
public interface EmployeeCodeService extends MongoRepository<Employeecode, String> {
}