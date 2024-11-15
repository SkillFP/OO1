package ar.edu.unlp.info.oo1;

public class EnvioExpressDomicilio implements Enviable{
    private String direccionSalida;
    private String direccionLlegada;

    public EnvioExpressDomicilio(String direccionSalida, String direccionLlegada) {
        this.direccionSalida = direccionSalida;
        this.direccionLlegada = direccionLlegada;
    }

    @Override
    public double calcularPrecio() {
        return 100; //imaginemos calculadoraDistancia con las variables de instancia.
    }
}
