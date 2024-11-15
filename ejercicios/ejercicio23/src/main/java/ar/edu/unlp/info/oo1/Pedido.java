package ar.edu.unlp.info.oo1;

public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto;
    private int cantidadInvolucrada;
    private Pagable formaDePago;
    private Enviable envioSeleccionado;

    Pedido (Cliente cliente, Vendedor vendedor, Producto producto, int cantidadInvolucrada, Pagable formaDePago, Enviable envioSeleccionado) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidadInvolucrada = cantidadInvolucrada;
        this.formaDePago = formaDePago;
        this.envioSeleccionado = envioSeleccionado;
    }

    public double calcularCostoTotal(){
        return this.formaDePago.calcularPrecio(producto.getPrecio()) * cantidadInvolucrada
                + this.envioSeleccionado.calcularPrecio();
    }
}
