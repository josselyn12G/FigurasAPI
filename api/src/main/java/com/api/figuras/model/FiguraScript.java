package com.api.figuras.model;

// Representa una figura enviada por la API
public class FiguraScript {

    private String nombre;
    private String codigo;

    public FiguraScript(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}