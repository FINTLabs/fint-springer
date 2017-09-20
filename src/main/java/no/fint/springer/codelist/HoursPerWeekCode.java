package no.fint.springer.codelist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.kodeverk.Stillingskode;
import no.fint.model.administrasjon.kodeverk.TimerPerUkeKode;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class HoursPerWeekCode {

    @Id
    private String id;
    private TimerPerUkeKode hoursperweekcode;
}
