package no.fint.springer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoTemplate
import spock.lang.Requires
import spock.lang.Specification

// TODO Doesn't work?
@Requires({ env.ENABLE_MONGODB_TESTS })
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
        collections.size() == SpringerModels.modelNames.size()
        collections.each {
            assert mongoTemplate.getCollection(it).count() > 0
        }
    }
}
