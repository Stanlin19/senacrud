package com.senacrud.senacrud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Marcar este objeto como una tabla de base de datos (lo crea automaticamente)
public class Persona {

    @Id // marca el campo id
    @GeneratedValue(strategy = GenerationType.AUTO) //hace que el id sea auto incrementable
    private Long id;
    private String nombre;
    private int edad;
    private boolean vivo;

    public Persona() {
    }

    public Persona(Long id, String nombre, int edad, boolean vivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.vivo = vivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
