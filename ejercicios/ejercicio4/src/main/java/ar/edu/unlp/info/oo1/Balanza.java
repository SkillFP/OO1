package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private List<Producto> productos;

    public Balanza(){
        productos = new ArrayList<>();
    }

    public void ponerEnCero(){
        productos.clear();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public Ticket emitirTicket(){
        return new Ticket(productos);
    }

    public double getPesoTotal(){
        return productos.stream().
                mapToDouble(producto -> producto.getPeso()).
                sum();
    }

    public double getPrecioTotal(){
        return productos.stream().
                mapToDouble(producto -> producto.getPrecio()).
                sum();
    }

    public int getCantidadDeProductos(){
        return productos.size();
    }
}
