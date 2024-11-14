package ar.edu.unlp.info.oo1;

public class Maquina {
    private double montoMantenimiento;

    public Maquina (double montoMantenimiento){
        this.montoMantenimiento = montoMantenimiento;
    }

    public double getMontoMantenimiento() {
        return this.montoMantenimiento;
    }
    public void setMontoMantenimiento(double montoMantenimiento) {
        this.montoMantenimiento = montoMantenimiento;
    }
}
