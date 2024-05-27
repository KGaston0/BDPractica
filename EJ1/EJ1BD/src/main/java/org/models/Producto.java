package org.models;

import java.time.LocalDateTime;

public class Producto {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private LocalDateTime fecha_creacion;

    public Producto(String nombre, String descripcion, Double precio, LocalDateTime fecha_creacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", fecha_creacion=" + fecha_creacion +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        precio = precio;
    }

    public LocalDateTime getFecha_Creacion() {
        return fecha_creacion;
    }

    public void setFecha_Creacion(LocalDateTime fecha_Creacion) {
        fecha_creacion = fecha_Creacion;
    }
}
