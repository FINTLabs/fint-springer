package no.fint.springer.codelist;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.FUNCTIONCODES_VALUE, path = Resources.FUNCTIONCODES_VALUE)
public interface FunctioncodeService extends MongoRepository<Functioncode, String> {
}