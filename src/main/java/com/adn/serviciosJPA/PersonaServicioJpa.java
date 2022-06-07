package com.adn.serviciosJPA;

import com.adn.modelos.Persona;
import com.adn.repositorios.PersonaRepositorio;
import com.adn.services.InterfacePersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicioJpa implements InterfacePersonaServicio {
    @Autowired
    private PersonaRepositorio repoPersona;



    public void guardar(Persona persona) {
        repoPersona.save(persona);
    }

    public void eliminar(long idPersona) {
        repoPersona.deleteById(idPersona);
    }

    public List<Persona> buscarTodos() {
        return repoPersona.findAll();
    }

    @Override
    public Optional<Persona> buscarPersonaPorID(Long idPersona) {
        return Optional.empty();
    }


}
