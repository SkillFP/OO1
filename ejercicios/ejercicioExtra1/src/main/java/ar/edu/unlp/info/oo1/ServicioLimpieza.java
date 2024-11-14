package ar.edu.unlp.info.oo1;

public class ServicioLimpieza extends Servicio {
    private double montoMinimo;

    public ServicioLimpieza(double montoHora, double cantidadHoras, double montoMinimo) {
        super(montoHora, cantidadHoras);
        this.montoMinimo = montoMinimo;
    }

    public double getMontoMinimo() {
        return this.montoMinimo;
    }

    public void setMontoMinimo(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    @Override
    public double calcularMonto() {
        double montoHoras = super.calcularMontoHoras();
        if (getMontoMinimo() < montoHoras) return this.montoMinimo;
        return montoHoras;
    }
}
