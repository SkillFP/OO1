package ar.edu.unlp.info.oo1;

public class Gerente extends EmpleadoJerarquico {

    public Gerente(String string) {
        super(string);
    }

    public double aportes() {
        return this.montoBasico() * 0.05d;
    }

    public double montoBasico() {
        return 57000;
    }
}

//Gerente alan = new Gerente("Alan Turing");
//double aportesDeAlan = alan.aportes();
//Qué monto tendrá aportesDeAlan?
//aportesDeAlan tendrá el valor igual a 57000*0.05 (toma montoBasico en Gerente y lo lleva a aportes).

//Gerente alan = new Gerente("Alan Turing");
//double sueldoBasicoDeAlan = alan.sueldoBasico();
//Qué monto tendrá sueldoBasicoDeAlan?
//Primero buscará sueldoBasico en Gerente y como no está irá a EmpleadoJerárquico ahí lo encuentra, va a la
//superclase y toma montoBasico+aportes, ambos existen en Gerente así que los toma (57000 y 57000*0,05)
//simando finalmente 8000 por el bono por categoría, que buscaría en Gerente y luego en EmpleadoJerarquico.
//sueldoBasicoDeAlan tendrá el valor igual a 57000 + 2850 + 8000.
