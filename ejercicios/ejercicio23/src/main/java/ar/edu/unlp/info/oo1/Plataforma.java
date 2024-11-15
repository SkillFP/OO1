package ar.edu.unlp.info.oo1;
import java.util.Set;
import java.util.HashSet;

public class Plataforma {
    private Set<Cliente> clientesRegistrados = new HashSet<>();
    private Set<Vendedor> vendedoresRegistrados = new HashSet<>();
    private Set<Producto> productosStock = new HashSet<>();

    public Plataforma() {}

    public void addProducto (Producto producto) {
        productosStock.add(producto);
    }

    public void addCliente (Cliente cliente) {
        clientesRegistrados.add(cliente);
    }

    public void addVendedor (Vendedor vendedor) {
        vendedoresRegistrados.add(vendedor);
    }

    public boolean hasStock (Producto producto, int cantidad) {
        if (producto.getCantidad() < cantidad) return false;
        producto.reduceStock(cantidad);
        if (producto.getCantidad()==0) removeProducto(producto);
        return true;
    }

    private void removeProducto (Producto producto) {
        productosStock.remove(producto);
    }
}
