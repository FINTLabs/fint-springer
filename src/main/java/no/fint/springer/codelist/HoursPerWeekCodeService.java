package no.fint.springer.codelist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

                        
@RepositoryRestResource(collectionResourceRel = "hoursperweekcodes", path = "hoursperweekcodes")
public interface HoursPerWeekCodeService extends MongoRepository<HoursPerWeekCode, String> {
}