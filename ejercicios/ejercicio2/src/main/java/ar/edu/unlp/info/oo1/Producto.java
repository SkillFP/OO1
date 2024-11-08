package ar.edu.unlp.info.oo1;

public class Producto {
    private int precioPorKilo;
    private String descripcion;
    private double peso;

    public Producto(){};

    public void setPrecioPorKilo(int precioPorKilo){
        this.precioPorKilo = precioPorKilo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPrecio(){
        return this.precioPorKilo*this.peso;
    }
    public double getPeso(){
        return this.peso;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getPrecioPorKilo(){
        return this.precioPorKilo;
    }
}
