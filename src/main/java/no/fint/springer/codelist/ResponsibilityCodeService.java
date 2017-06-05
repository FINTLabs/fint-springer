package no.fint.springer.codelist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "responsibilitycodes", path = "responsibilitycodes")
public interface ResponsibilityCodeService extends MongoRepository<ResponsibilityCode, String> {
}