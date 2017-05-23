package no.fint.springer.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.personal.Personalressurs;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {

    @Id
    private String id;
    private Personalressurs employee;
    private String relatedToPersonNr;
    private String relatedToEmploymentNr;
}
