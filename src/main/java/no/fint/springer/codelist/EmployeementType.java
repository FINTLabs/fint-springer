package no.fint.springer.codelist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.kodeverk.Arbeidsforholdstype;
import no.fint.model.administrasjon.kodeverk.Stillingskode;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class EmployeementType {

    @Id
    private String id;
    private Arbeidsforholdstype employeementType;
}
