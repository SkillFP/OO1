package ar.edu.unlp.info.oo1;

public class Producto {
    private double peso;
    private int precioPorKilo;
    private String descripcion;

    public Producto() {}

    public double getPrecio(){
        return this.peso*this.precioPorKilo;
    }

    //GETTERS Y SETTERS//

    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setPrecioPorKilo(int precioPorKilo){
        this.precioPorKilo = precioPorKilo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public double getPeso(){
        return this.peso;
    }
    public int getPrecioPorKilo(){
        return this.precioPorKilo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}
