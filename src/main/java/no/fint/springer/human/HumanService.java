package no.fint.springer.human;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.HUMANS_VALUE, path = Resources.HUMANS_VALUE)
public interface HumanService extends MongoRepository<Human, String> {
}
