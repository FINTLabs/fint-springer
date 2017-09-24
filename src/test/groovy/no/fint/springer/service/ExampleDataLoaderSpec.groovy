package no.fint.springer.service

import no.fint.springer.Resources
import no.fint.springer.TestApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.test.context.ActiveProfiles
import spock.lang.Requires
import spock.lang.Specification

@Requires({ Boolean.valueOf(properties['enableMongodbTests']) })
@ActiveProfiles('test')
@SpringBootTest(classes = TestApplication)
class ExampleDataLoaderSpec extends Specification {

    @Autowired
    private ExampleDataLoader exampleDataLoader

    @Autowired
    private MongoTemplate mongoTemplate

    def "Load example data"() {
        when:
        def name = mongoTemplate.getDb().name
        def collections = mongoTemplate.getCollectionNames()


        then:
        name == 'springer'
        collections.size() == exampleDataLoader.resources.length
        collections.size() == Resources.constants().size()
        for (def collection : collections) {
            assert mongoTemplate.getCollection(collection).count() > 0
        }
    }
}
