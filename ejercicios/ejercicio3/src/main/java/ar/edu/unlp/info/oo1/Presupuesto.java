package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> items;

    public Presupuesto(String cliente){
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.items = new ArrayList<Item>();
    }

    //Metodos//

    public void agregarItem (Item item){
        this.items.add(item);
    }

    public double calcularTotal(){
        return this.items.stream().mapToDouble(item -> item.costo()).sum();
    }

    //Getters y setters//


    public LocalDate getFecha(){
        return fecha;
    }

    public String getCliente(){
        return cliente;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public void setcliente(String cliente){
        this.cliente = cliente;
    }
}