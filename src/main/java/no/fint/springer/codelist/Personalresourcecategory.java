package no.fint.springer.codelist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.kodeverk.Personalressurskategori;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Personalresourcecategory {
    @Id
    private String id;
    private Personalressurskategori personalResourceCategory;
}
