package no.fint.springer;

import groovy.util.logging.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@Slf4j
@Import(SpringDataRestConfiguration.class)
@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
