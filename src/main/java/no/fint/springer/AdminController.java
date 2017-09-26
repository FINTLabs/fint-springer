package no.fint.springer;


import no.fint.springer.service.ExampleDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private ExampleDataLoader exampleDataLoader;

    @GetMapping("/reload-example-data")
    public ResponseEntity reloadExampleData() {
        try {
            exampleDataLoader.init();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

        return ResponseEntity.ok().build();
    }
}
