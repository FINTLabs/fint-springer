package no.fint.springer

import no.fint.springer.service.ExampleDataLoader
import no.fint.test.utils.MockMvcSpecification
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest(classes = TestApplication)
class AdminControllerSpec extends MockMvcSpecification {
    private MockMvc mockMvc
    private ExampleDataLoader exampleDataLoader
    private AdminController controller

    void setup() {
        exampleDataLoader = Mock(ExampleDataLoader)
        controller = new AdminController(exampleDataLoader: exampleDataLoader)
        mockMvc = standaloneSetup(controller)
    }

    def "Return status 200 when init() returns OK"() {
        when:
        def response = mockMvc.perform(get('/admin/reload-example-data'))

        then:
        response.andExpect(status().isOk())
    }

    def "Return status 500 when init() throws exception"() {
        when:
        def response = mockMvc.perform(get('/admin/reload-example-data'))

        then:
        1 * exampleDataLoader.init() >> { throw new IOException('test exception') }
        response.andExpect(status().isInternalServerError())
    }

}
