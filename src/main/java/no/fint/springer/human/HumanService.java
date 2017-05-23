package no.fint.springer.human;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "humans", path = "humans")
public interface HumanService extends MongoRepository<Human, String> {
}
