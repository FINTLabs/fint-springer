package no.fint.springer.employment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "employments", path = "employments")
public interface EmploymentService extends MongoRepository<Employment, String> {
}