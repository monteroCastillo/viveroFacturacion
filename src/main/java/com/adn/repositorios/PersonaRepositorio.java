package com.adn.repositorios;

import com.adn.modelos.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

    @Query("select p from Persona p where p.nombre=?1")
    Optional<Persona> findByPersona(String nombre);

    Optional<Persona> findByIdPersona(Long idPersona);

}
