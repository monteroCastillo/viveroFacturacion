package com.adn.controladores;

import com.adn.modelos.Persona;
import com.adn.services.InterfacePersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiPersona")
public class ControladorPersona {

    @Autowired
    private  InterfacePersonaServicio servicioPersona;

    @GetMapping({"/index"})
    public List<Persona> buscarTodos() {
        return servicioPersona.buscarTodos();
    }

    @PostMapping({"/persona"})
    public Persona guardar(@RequestBody Persona persona) {
        servicioPersona.guardar(persona);
        return persona;
    }

    @PutMapping({"/persona"})
    public Persona modificar(@RequestBody Persona persona) {
        servicioPersona.guardar(persona);
        return persona;
    }

    @DeleteMapping({"/persona/{id}"})
    public String eliminar(@PathVariable("id") int idPersona) {
        servicioPersona.eliminar((long)idPersona);
        return "Registro dePersona eliminada";
    }
}
