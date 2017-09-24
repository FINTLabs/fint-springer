package no.fint.springer.codelist;

import no.fint.springer.Resources;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = Resources.HOURSPERWEEKCODES, path = Resources.HOURSPERWEEKCODES)
public interface HoursperweekcodeService extends MongoRepository<Hoursperweekcode, String> {
}