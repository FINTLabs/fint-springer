package no.fint.springer.organisation;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.ORGANISATIONS, path = Resources.ORGANISATIONS)
public interface OrganisationService extends MongoRepository<Organisation, String> {
}
