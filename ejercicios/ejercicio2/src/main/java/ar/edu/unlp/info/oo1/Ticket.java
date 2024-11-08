package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    public Ticket (int cantidadDeProductos, double pesoTotal, double precioTotal) {
        this.cantidadDeProductos = cantidadDeProductos;
        this.precioTotal = precioTotal;
        this.pesoTotal = pesoTotal;
        this.fecha = LocalDate.now();
    }

    public double impuesto(){
        return precioTotal*0.21;
    }

    public int getCantidadDeProductos(){
        return cantidadDeProductos;
    }
    public double getPrecioTotal(){
        return precioTotal;
    }
    public double getPesoTotal(){
        return pesoTotal;
    }
    public LocalDate getFecha(){
        return fecha;
    }
}
