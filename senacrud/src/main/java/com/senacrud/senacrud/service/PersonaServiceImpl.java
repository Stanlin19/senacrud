package com.senacrud.senacrud.service;

import com.senacrud.senacrud.models.Persona;
import com.senacrud.senacrud.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Implementa los metodos abstractos de la interface
@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired //inyecta la dependencia del repositorio para usarlo en toda la clase
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll(); //equivalente a (select * from Persona)
    }

    @Override
    public Persona getById(Long id) {
        Optional<Persona> persona = personaRepository.findById(id); //equivalente a (select * from persona where id = :id)
        if(persona.isPresent()){
            return persona.get();
        } else {
            System.out.println("La persona con id " + id + " no existe en base de datos");
            return new Persona();
        }
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona); //equivalente a insert into persona values ....
    }

    @Override
    public Persona update(Persona persona) {
        return personaRepository.save(persona); //equivalente al guardar o actualizar
    }

    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id); //equivaletne a delete from persona where id = :id
    }
}
