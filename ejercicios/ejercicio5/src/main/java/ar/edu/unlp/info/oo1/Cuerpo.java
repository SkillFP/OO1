package ar.edu.unlp.info.oo1;

public class Cuerpo {
    private Forma caraBasal;
    private double altura;

    public Cuerpo(Forma caraBasal, double altura){
        this.caraBasal=caraBasal;
        this.altura=altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getSuperficieExterior(){
        return this.caraBasal.getArea()*2+this.caraBasal.getPerimetro()*this.altura;;
    }

    public double getVolumen(){
        return this.altura;
    }
}