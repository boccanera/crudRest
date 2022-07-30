package crud.repository;

import crud.models.Evento;
import org.springframework.data.repository.CrudRepository;


public interface EventoRepository extends CrudRepository<Evento, String> {

    Evento findByCodigo(Long codigo);


}
