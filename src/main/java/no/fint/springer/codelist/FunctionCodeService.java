package no.fint.springer.codelist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "functioncodes", path = "functioncodes")
public interface FunctionCodeService extends MongoRepository<FunctionCode, String> {
}