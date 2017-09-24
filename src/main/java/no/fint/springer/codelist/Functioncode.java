package no.fint.springer.codelist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.kodeverk.Ansvar;
import no.fint.model.administrasjon.kodeverk.Funksjon;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Functioncode {

    @Id
    private String id;
    private Funksjon functionCode;
}
