package com.senacrud.senacrud.service;

import com.senacrud.senacrud.models.Persona;

import java.util.List;
//Funciones abstractas
public interface PersonaService {

    List<Persona> findAll();
    Persona getById(Long id);
    Persona save(Persona persona);
    Persona update(Persona persona);
    void deleteById(Long id);
}
