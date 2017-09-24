package no.fint.springer.codelist;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.PERSONALRESOURCECATEGORIES_VALUE, path = Resources.PERSONALRESOURCECATEGORIES_VALUE)
public interface PersonalresourcecategoryService extends MongoRepository<Personalresourcecategory, String> {
}