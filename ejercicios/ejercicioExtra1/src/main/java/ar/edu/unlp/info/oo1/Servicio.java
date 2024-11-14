package ar.edu.unlp.info.oo1;
// io.github.unlp-oo
public abstract class Servicio {
    private double precioHora;
    private double cantidadHoras;

    public Servicio (double precioHora, double cantidadHoras){
        this.precioHora = precioHora;
        this.cantidadHoras = cantidadHoras;
    }

    public abstract double calcularMonto();

    public double calcularMontoHoras(){
        return this.cantidadHoras * this.precioHora;
    }

    //GETTERS Y SETTERS.
    public double getCantidadHoras() {
        return this.cantidadHoras;
    }
    public double getPrecioHora() {
        return this.precioHora;
    }
    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
}
