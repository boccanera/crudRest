package crud.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    private String nome;
    private String local;
    private String data;
    private String horario;

    @OneToMany
    private List<Convidado> convidados;

}
