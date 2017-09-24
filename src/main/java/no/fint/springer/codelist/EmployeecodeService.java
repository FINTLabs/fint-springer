package no.fint.springer.codelist;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.EMPLOYEECODES, path = Resources.EMPLOYEECODES)
public interface EmployeecodeService extends MongoRepository<Employeecode, String> {
}