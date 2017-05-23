package no.fint.springer.employment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import org.springframework.data.annotation.Id;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Employment {

    @Id
    private String id;
    private Arbeidsforhold employment;
    private String relatedToEmployeeNr;
    private String relatedToOrgId;
}
