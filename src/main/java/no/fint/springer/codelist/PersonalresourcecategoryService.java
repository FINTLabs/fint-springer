package no.fint.springer.codelist;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.PERSONALRESOURCECATEGORIES, path = Resources.PERSONALRESOURCECATEGORIES)
public interface PersonalresourcecategoryService extends MongoRepository<Personalresourcecategory, String> {
}