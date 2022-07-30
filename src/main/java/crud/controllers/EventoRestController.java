package crud.controllers;

import crud.models.Evento;
import crud.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventoRestController {

    @Autowired
    private EventoRepository er;

    @GetMapping("/todos")
    public List<Evento> getAllEventos() {
        return (List<Evento>) er.findAll();
    }

}
