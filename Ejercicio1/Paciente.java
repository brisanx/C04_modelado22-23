import java.util.*;

public class Paciente {
    private List<Expediente> listaExpedientes;
    private Expediente expedienteAbierto;

    public Paciente() {
        this.listaExpedientes = new ArrayList<Expediente>();
        Expediente e = new Expediente(this);
        this.listaExpedientes.add(e);
        this.expedienteAbierto = e;
    }

    void addExpediente(Expediente e) {
        assert(e != null);
        this.listaExpedientes.add(e);
    }

    void rmExpediente(Expediente e){
        assert(e!=null);
        this.listaExpedientes.remove(e);
    }

    public Expediente getExpedienteAbierto() {
        return this.expedienteAbierto;
    }

    void setExpedienteAbierto(Expediente e) {
        assert(listaExpedientes.contains(e));
        this.expedienteAbierto = e;
    }

    void cerrarExpediente(){
        this.expedienteAbierto = null;
    } 

    public Enumeration<Expediente> getListaExpedientes() {
        return Collections.enumeration(this.listaExpedientes);
    }
}