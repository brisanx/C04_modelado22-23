import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private List<Expediente> listaExpedientes;
    private Expediente expedienteAbierto;

    public Paciente() {
        listaExpedientes = new ArrayList<>();
    }

    public List<Expediente> getListaExpedientes() {
        return listaExpedientes;
    }
    
    public Expediente getExpedienteAbierto() {return this.expedienteAbierto;}

    void setExpedienteAbierto(Expediente e) {this.expedienteAbierto = e;} 

    void setExpedienteCerrado(Expediente e) {this.expedienteAbierto = null;} 

    public void addExpediente(Expediente e) {
        assert(e != null);
        listaExpedientes.add(e);
    }
}
