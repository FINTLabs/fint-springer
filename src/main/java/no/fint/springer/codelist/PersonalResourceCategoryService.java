package no.fint.springer.codelist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "personresourcecategories", path = "personresourcecategories")
public interface PersonalResourceCategoryService extends MongoRepository<PersonalResourceCategory, String> {
}