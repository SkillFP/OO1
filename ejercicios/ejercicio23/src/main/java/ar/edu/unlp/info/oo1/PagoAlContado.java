package ar.edu.unlp.info.oo1;

public class PagoAlContado implements Pagable{

    @Override
    public double calcularPrecio(double precio) {
        return precio;
    }
}
