import java.util.*;
public class Expediente{
    private List<Acceso> accesoExpediente;
    private Paciente paciente;
   
    public Expediente(Paciente p){
        accesoExpediente = new ArrayList<Acceso>();
        this.paciente = p;
    }
    
    protected void addAcceso(Acceso a){
        assert(a!=null);
        this.accesoExpediente.add(a);
    }
    protected void rmAcceso(Acceso a){
        assert(a!=null);
        this.accesoExpediente.remove(a);
    }

    public Enumeration<Acceso> getAccesoExpediente(){
        return Collections.enumeration(accesoExpediente);
    }

    public Paciente getPaciente() {return this.paciente;}
}