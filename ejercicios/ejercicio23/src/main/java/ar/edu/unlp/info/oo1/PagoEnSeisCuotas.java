package ar.edu.unlp.info.oo1;

public class PagoEnSeisCuotas implements Pagable{

    public double calcularPrecio(double precio){
        return precio*1.20;
    }
}
