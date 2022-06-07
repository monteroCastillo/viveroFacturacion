package com.adn.services;

import com.adn.modelos.Persona;

import java.util.List;
import java.util.Optional;

public interface InterfacePersonaServicio {
    void guardar(Persona persona);

    void eliminar(long idPersona);

    List<Persona> buscarTodos();

    Optional<Persona> buscarPersonaPorID(Long idPersona);
}

