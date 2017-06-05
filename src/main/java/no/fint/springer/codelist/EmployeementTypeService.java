package no.fint.springer.codelist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "employeementtypes", path = "employeementtypes")
public interface EmployeementTypeService extends MongoRepository<EmployeementType, String> {
}