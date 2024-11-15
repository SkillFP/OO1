package ar.edu.unlp.info.oo1;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

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

    public void cantidadPorCategoria (){
        categoriaCantidad.entrySet()
                .stream()
                .forEach(entry -> System.out.println("Categoría: " + entry.getKey() + " Cantidad: " + entry.getValue()));
    }

    //En el ejercicio no era necesario hacer el primer Map aunque es una solución válida.
    //Los métodos resuelven con lo que nos digan que hay por enunciado. No creamos nada adicional.
    public void cantidadPorCategoriaAlternativo(){
        Map<String, Integer> cantidadPorCategoriapedidos = pedidos
                .stream()
                .collect(Collectors.groupingBy(
                        pedido -> pedido.getProducto().getCategoria(),
                        Collectors.summingInt(pedido -> pedido.getProducto().getCantidad())
                ));
    }
}
