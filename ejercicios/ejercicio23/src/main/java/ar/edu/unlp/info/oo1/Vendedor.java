package ar.edu.unlp.info.oo1;
import java.util.Set;
import java.util.HashSet;
public class Vendedor extends Persona {
    private Set<Producto> productos = new HashSet<>();

    public Vendedor (String nombre, String direccion, Plataforma plataforma){
        super(nombre, direccion);
        plataforma.addVendedor(this);
    }

    public void publicarProducto(Producto producto, Plataforma plataforma){
        productos.add(producto);
        plataforma.addProducto(producto);
    }
}
