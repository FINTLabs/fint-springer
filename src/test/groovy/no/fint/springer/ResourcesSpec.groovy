package no.fint.springer

import no.fint.springer.service.ExampleDataLoader
import spock.lang.Specification

class ResourcesSpec extends Specification {

    def "Verify resources and json-files"() {
        when:
        def resourceFiles = new ExampleDataLoader().resources

        then:
        resourceFiles.length == Resources.constants().size()
    }
}