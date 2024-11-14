package ar.edu.unlp.info.oo1;
import java.time.LocalDate;

public class ContratacionProlongada extends Contratacion{
    private LocalDate fechaInicial;
    private int cantidadDias;

    public ContratacionProlongada(LocalDate fechaInicial, int cantidadDias, Servicio servicio, Cliente cliente) {
        super(cliente, servicio);
        this.fechaInicial = fechaInicial;
        this.cantidadDias = cantidadDias;
        cliente.addContrato(this);
    }

    public int getCantidadDias() {
        return this.cantidadDias;
    }

    @Override
    public double calcularMonto() {
        double monto = super.getServicio().calcularMonto() * getCantidadDias();
        if (getCantidadDias()<=5) return monto;
        return monto*0.9;
    }
}
