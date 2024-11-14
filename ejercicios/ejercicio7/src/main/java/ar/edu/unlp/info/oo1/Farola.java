package ar.edu.unlp.info.oo1;

import java.util.HashSet;
import java.util.Set;

public class Farola {
    private static int cantidadFarolas = 0;
    private int identificador;
    private boolean encendida = false;
    private Set<Farola> farolasVecinas;

    public Farola() {
        this.farolasVecinas = new HashSet<Farola>();
        cantidadFarolas++;
        this.identificador = cantidadFarolas;
    }

    public boolean isOn(){
        return this.encendida;
    }

    public boolean isOff(){
        return !this.encendida;
    }

    public Set<Farola> getNeighbors() {
        return this.farolasVecinas;
    }

    public void pairWithNeighbor (Farola otraFarola) {
        this.farolasVecinas.add(otraFarola);
        otraFarola.getNeighbors().add(this);
    }

    public void turnOn(){
        if (this.isOff()){
            this.encendida = true;
            this.getNeighbors().forEach(f -> f.turnOn());
        }
    }

    public void turnOff(){
        if (this.isOn()){
            this.encendida=false;
            this.getNeighbors().forEach(f -> f.turnOff());
        }
    }
}