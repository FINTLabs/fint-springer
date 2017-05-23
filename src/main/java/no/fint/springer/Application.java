package no.fint.springer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@EnableSpringfox
@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
