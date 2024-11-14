package ar.edu.unlp.info.oo1;
import java.util.Set;
import java.util.HashSet;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private Set<Contratacion> contratos;

    public Cliente(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.contratos = new HashSet();
    }

    public void addContrato(Contratacion contratacion) {
        this.contratos.add(contratacion);
    }

    public Set<Contratacion> getContratos() {
        return this.contratos;
    }

    public long getAmountServicesGreaterThan(double valor){
        return getContratos()
                .stream()
                .filter(c -> c.getServicio().calcularMonto() > valor)
                .count();
    }
}
