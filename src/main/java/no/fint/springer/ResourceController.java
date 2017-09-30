package no.fint.springer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/{collection}")
    public ResponseEntity getResource(@PathVariable String collection) {
        try {
            Class<?> modelClass = SpringerModels.getModelClass(collection);
            List<?> values = mongoTemplate.find(null, modelClass, collection);
            return ResponseEntity.ok(values);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(String.format("The collection %s was not found", collection));
        }
    }

    @GetMapping
    public List<String> getResources() {
        return SpringerModels.getModelNames();
    }
}
