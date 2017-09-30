package no.fint.springer;

import groovy.util.logging.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
