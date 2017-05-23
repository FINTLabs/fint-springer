package no.fint.springer.organisation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "organisations", path = "organisations")
public interface OrganisationService extends MongoRepository<Organisation, String> {
}
