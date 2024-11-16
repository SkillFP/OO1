package ar.edu.unlp.info.oo1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    private Pedido pedido1, pedido2, pedido3, pedido4, pedido5, pedido6;
    private Cliente cliente;
    private Producto producto;
    private Vendedor vendedor;
    private Enviable envioComercio = new EnvioComercio();
    private Enviable envioExpressDomicilio = new EnvioExpressDomicilio("Direccion1", "Direccion2");
    private Enviable envioSucursal  = new EnvioSucursal();
    private Pagable pagoContado = new PagoAlContado();
    private Pagable pagoEnSeisCuotas = new PagoEnSeisCuotas();
    private Plataforma plataforma;

    @BeforeEach
    public void setUp() {
        plataforma = new Plataforma();
        producto = new Producto("Zapatillas", "Calzado", 100, 2);
        vendedor= new Vendedor("Nombre", "Direccion", plataforma);
        cliente=new Cliente("Nombre", "Direccion", plataforma);
        pedido1=new Pedido(cliente, vendedor, producto, 2, pagoContado, envioComercio);
        pedido2=new Pedido(cliente, vendedor, producto, 2, pagoContado, envioExpressDomicilio);
        pedido3=new Pedido(cliente, vendedor, producto, 2, pagoContado, envioSucursal);
        pedido4=new Pedido(cliente, vendedor, producto, 2, pagoEnSeisCuotas, envioComercio);
        pedido5=new Pedido(cliente, vendedor, producto, 2, pagoEnSeisCuotas, envioExpressDomicilio);
        pedido6=new Pedido(cliente, vendedor, producto, 2, pagoEnSeisCuotas, envioSucursal);
    }

    @Test
        void testCalcularCostoTotal(){
            assertEquals(pedido1.calcularCostoTotal(), 200);
            assertEquals(pedido2.calcularCostoTotal(), 300);
            assertEquals(pedido3.calcularCostoTotal(), 3200);
            assertEquals(pedido4.calcularCostoTotal(), 240);
            assertEquals(pedido5.calcularCostoTotal(), 340);
            assertEquals(pedido6.calcularCostoTotal(), 3240);
    }
}
