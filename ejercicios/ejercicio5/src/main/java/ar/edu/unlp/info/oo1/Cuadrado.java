package ar.edu.unlp.info.oo1;

public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado (double lado){
        this.lado=lado;
    }

    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getPerimetro(){
        return this.lado*4;
    }

    public double getArea(){
        return this.lado*this.lado;
    }
}