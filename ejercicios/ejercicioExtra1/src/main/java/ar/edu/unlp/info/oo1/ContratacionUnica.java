package ar.edu.unlp.info.oo1;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ContratacionUnica extends Contratacion{
    private LocalDate fechaContratacion;

    public ContratacionUnica(LocalDate fechaContratacion, Servicio servicio, Cliente cliente) {
        super(cliente, servicio);
        this.fechaContratacion = fechaContratacion;
        cliente.addContrato(this);
    }
    public LocalDate getFechaContratacion() {
        return this.fechaContratacion;
    }

    @Override
    public double calcularMonto() {
        double monto = super.getServicio().calcularMonto();
        if ((getFechaContratacion().getDayOfWeek() == DayOfWeek.SATURDAY) ||
                (getFechaContratacion().getDayOfWeek() == DayOfWeek.SUNDAY)) return monto*1.15;
        return monto;
    }
}
