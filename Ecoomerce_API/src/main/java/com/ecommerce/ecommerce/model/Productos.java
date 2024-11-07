package com.ecommerce.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String imagen;

    private Double nuevoPrecio;

    private Double precioAnterior;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categoria;
    

    public Productos() {
    }


    public Productos(long id, String nombre, String imagen, Double nuevoPrecio, Double precioAnterior, Categorias categoria) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.nuevoPrecio = nuevoPrecio;
        this.precioAnterior = precioAnterior;
        this.categoria = categoria;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return this.imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Double getNuevoPrecio() {
        return this.nuevoPrecio;
    }

    public void setNuevoPrecio(Double nuevoPrecio) {
        this.nuevoPrecio = nuevoPrecio;
    }

    public Double getPrecioAnterior() {
        return this.precioAnterior;
    }

    public void setPrecioAnterior(Double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }

    public Categorias getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

}
