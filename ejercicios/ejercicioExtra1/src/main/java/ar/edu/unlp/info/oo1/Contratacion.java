package ar.edu.unlp.info.oo1;
import java.time.LocalDate;

public abstract class Contratacion {
    private Cliente cliente;
    private Servicio servicio;
    private LocalDate fechaContratacion;

    public Contratacion(Cliente cliente, Servicio servicio) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.fechaContratacion = LocalDate.now();
    }

    public Servicio getServicio() {
        return this.servicio;
    }

    public abstract double calcularMonto();
}
