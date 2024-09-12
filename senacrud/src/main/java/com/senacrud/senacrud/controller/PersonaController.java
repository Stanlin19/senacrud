package com.senacrud.senacrud.controller;

import com.senacrud.senacrud.models.Persona;
import com.senacrud.senacrud.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //este es el punto de acceso al programa
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("personas")
    public List<Persona> getAll(){
        return personaService.findAll();
    }

    @GetMapping("personas/{id}") //lo que esta entre llaves lo captura dinamicamente con @PathVaribale
    public Persona getById(@PathVariable Long id){
        return personaService.getById(id);
    }
}
