package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<Producto> productos;
    private LocalDate fecha;

    public Ticket (List<Producto> productos) {
        this.productos = new ArrayList<>(productos);
        this.fecha = LocalDate.now();
    }

    public double impuesto(){
        return this.productos.stream().mapToDouble(producto -> producto.getPrecio()*0.21).sum();
    }

    public double getPesoTotal(){
        return this.productos.stream().
                mapToDouble(producto -> producto.getPeso()).
                sum();
    }

    public double getPrecioTotal(){
        return this.productos.stream().
                mapToDouble(producto -> producto.getPrecio()).
                sum();
    }

    public int getCantidadDeProductos(){
        return this.productos.size();
    }

    public LocalDate getFecha(){
        return this.fecha;
    }
}
