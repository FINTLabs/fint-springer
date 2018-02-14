package no.fint.springer

import no.fint.springer.models.employee.Employee
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import spock.lang.Requires
import spock.lang.Specification
import spock.lang.Unroll

// TODO Doesn't work?
@Requires({ env.ENABLE_MONGODB_TESTS })
@SpringBootTest(classes = TestApplication, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ResourceControllerSpec extends Specification {

    @Autowired
    private TestRestTemplate restTemplate

    def "Get resources for and objects employee"() {
        when:
        def response = restTemplate.getForEntity('/resources/employee', Employee[])

        then:
        response.statusCode == HttpStatus.OK
        response.body.size() > 0
        response.body[0].class == Employee
    }

    @Unroll("Get resources for #resource")
    def "Get all resources"() {
        when:
        def response = restTemplate.getForEntity("/resources/${resource}", String)

        then:
        response.statusCode == HttpStatus.OK
        response.body.length() > 0

        where:
        resource                     | _
        SpringerModels.modelNames[0] | _
        SpringerModels.modelNames[1] | _
        SpringerModels.modelNames[2] | _
        SpringerModels.modelNames[3] | _
        SpringerModels.modelNames[4] | _
        SpringerModels.modelNames[5] | _
        SpringerModels.modelNames[6] | _
        SpringerModels.modelNames[7] | _
        SpringerModels.modelNames[8] | _
        SpringerModels.modelNames[9] | _
    }

    def "Return bad request if input collection does not exist"() {
        when:
        def response = restTemplate.getForEntity('/resources/unknown', String)

        then:
        response.statusCode == HttpStatus.BAD_REQUEST
    }

    def "Get resources"() {
        when:
        def response = restTemplate.getForEntity('/resources', String[])

        then:
        response.statusCode == HttpStatus.OK
        response.body.size() > 0
    }
}
