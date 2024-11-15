package ar.edu.unlp.info.oo1;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Cliente extends Persona{
    private Set<Pedido> pedidos = new HashSet<>();
    private Map<String, Integer> categoriaCantidad = new HashMap<>();

    public Cliente(String nombre, String direccion, Plataforma plataforma){
        super(nombre, direccion);
        plataforma.addCliente(this);
    }

    public void hacerPedido(Producto producto, int cantidad, Plataforma plataforma, Pagable formaDePago, Enviable envioSeleccionado, Vendedor vendedor){
        if (plataforma.hasStock(producto, cantidad)){
            pedidos.add(new Pedido (this, vendedor, producto, cantidad, formaDePago, envioSeleccionado));
            if (!categoriaCantidad.containsKey(producto.getCategoria()))
                categoriaCantidad.put(producto.getCategoria(), cantidad);
            categoriaCantidad.put(producto.getCategoria(), categoriaCantidad.get(producto.getCategoria()) + cantidad);
        }
    }

    public int cantidadDe (String categoria){
        if (!categoriaCantidad.containsKey(categoria)) return 0;
        return categoriaCantidad.get(categoria);
    }
}
