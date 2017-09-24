package no.fint.springer.employment;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.EMPLOYMENTS, path = Resources.EMPLOYMENTS)
public interface EmploymentService extends MongoRepository<Employment, String> {
}