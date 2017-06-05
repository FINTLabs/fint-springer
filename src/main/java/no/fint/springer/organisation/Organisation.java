package no.fint.springer.organisation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.organisasjon.Organisasjonselement;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Organisation {

    @Id
    private String id;
    private Organisasjonselement organisation;
    private List<String> relatedToEmploymentNr;
    private String relatedToOrgPartenNr;
    private List<String> relatedToOrgChildNr;
}
