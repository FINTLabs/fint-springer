package no.fint.springer;


import no.fint.springer.service.ExampleDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    ExampleDataLoader exampleDataLoader;

    @RequestMapping(value = "reload-example-data", method = RequestMethod.GET)
    public ResponseEntity reloadExampleData() {
        try {
            exampleDataLoader.init();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return ResponseEntity.ok().build();
    }
}
