package no.fint.springer.human;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.HUMANS, path = Resources.HUMANS)
public interface HumanService extends MongoRepository<Human, String> {
}
