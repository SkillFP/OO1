package ar.edu.unlp.info.oo1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mamifero {
    private String identificador;
    private String especie;
    private Date fechaDeNacimiento;
    private Mamifero padre=null;
    private Mamifero madre=null;

    public Mamifero(String identificador, String especie, Date fechaDeNacimiento, Mamifero padre, Mamifero madre) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.padre = padre;
        this.madre = madre;
    }

    public Mamifero(String identificador){
        this.identificador = identificador;
    }

    //Entendiendo como ancestro a cualquiera que en sentido ascendente en el árbol genealogico:
    public boolean tieneComoAncestroA(Mamifero unMamifero){
        boolean ancestroPorPadre = this.padre!=null && (this.padre.equals(unMamifero) || this.padre.tieneComoAncestroA(unMamifero));
        boolean ancestroPorMadre = this.madre!=null && (this.madre.equals(unMamifero) || this.madre.tieneComoAncestroA(unMamifero));
        return ancestroPorPadre || ancestroPorMadre;
    }

    //Abuelos paternos.
    public Mamifero getAbueloPaterno(){
        if (this.padre==null) return null;
        return this.padre.getPadre();
    }
    public Mamifero getAbuelaPaterna(){
        if (this.padre==null) return null;
        return this.padre.getMadre();
    }

    //Abuelos maternos.
    public Mamifero getAbueloMaterno(){
        if (this.madre==null) return null;
        return this.madre.getPadre();
    }
    public Mamifero getAbuelaMaterna(){
        if (this.madre==null) return null;
        return this.madre.getMadre();
    }

    //Getters, setters y constructor vacío.
    public Mamifero(){}

    public String getIdentificador() {
        return this.identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getEspecie() {
        return this.especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Date getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public Mamifero getPadre() {
        return this.padre;
    }
    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }
    public Mamifero getMadre() {
        return this.madre;
    }
    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }
}
