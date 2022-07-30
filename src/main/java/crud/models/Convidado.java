package crud.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;




@Entity
@Getter
@Setter
public class Convidado {

    @Id
    @NotBlank
    private String rg;

    @NotBlank
    private String nomeConvidado;

    @ManyToOne
    private Evento evento;

}
