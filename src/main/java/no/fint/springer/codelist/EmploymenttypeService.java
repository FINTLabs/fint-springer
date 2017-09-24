package no.fint.springer.codelist;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.EMPLOYMENTTYPES_VALUE, path = Resources.EMPLOYMENTTYPES_VALUE)
public interface EmploymenttypeService extends MongoRepository<Employmenttype, String> {
}