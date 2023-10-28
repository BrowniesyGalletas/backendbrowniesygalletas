package org.browniesygalletas.modelo;

public class Adiciones {
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;
    private static int ultimoId;

    public Adiciones(){
        this.id= ++ultimoId;
    }

    public Adiciones(String nombre, double precio, String descripcion) {
        this();
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
