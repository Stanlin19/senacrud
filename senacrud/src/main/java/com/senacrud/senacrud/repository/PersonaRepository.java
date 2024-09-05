package com.senacrud.senacrud.repository;

import com.senacrud.senacrud.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    //Aca se hace el llamado a las funciones o metodos de la base de datos, select, insert, update, delete...
}
