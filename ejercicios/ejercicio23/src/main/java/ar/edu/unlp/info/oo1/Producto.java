package ar.edu.unlp.info.oo1;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidad;

    Producto (String nombre, String categoria, double precio, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getCategoria() {
        return categoria;
    }
    public void reduceStock(int cantidad) {
        this.cantidad -= cantidad;
    }
}
