package ar.edu.unlp.info.oo1;
import java.util.Set;
import java.util.HashSet;

public class ServicioParquizacion extends Servicio {
    private Set<Maquina> maquinasUsadas;

    public ServicioParquizacion(double montoHora, double cantidadHoras) {
        super(montoHora, cantidadHoras);
        this.maquinasUsadas = new HashSet<>();
    }

    @Override
    public double calcularMonto() {
        if (getMaquinasUsadas() == null || getMaquinasUsadas().isEmpty()) return super.calcularMontoHoras();
        double costoMaquinas = getMaquinasUsadas().stream().mapToDouble(m -> m.getMontoMantenimiento()).sum();
        costoMaquinas = costoMaquinas * getMaquinasUsadas().size();
        return super.calcularMontoHoras() + costoMaquinas;
    }

    public Set<Maquina> getMaquinasUsadas(){
        return maquinasUsadas;
    }
    public void setMaquinasUsadas(Set<Maquina> maquinasUsadas){
        this.maquinasUsadas = maquinasUsadas;
    }

    public void addMaquina (Maquina maquina){
        this.maquinasUsadas.add(maquina);
    }
    public void removeMaquina (Maquina maquina){
        this.maquinasUsadas.remove(maquina);
    }
}
