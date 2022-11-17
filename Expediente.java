import java.util.*;
public class Expediente{
    private List<Acceso> accesoExpediente;

    public Expediente(Date f, TipoAcceso tA, Profesional prof){
        accesoExpediente = new ArrayList<Acceso>();
        Acceso a = new Acceso(f, tA, prof, this);
    }
    
    protected void addAcceso(Acceso a){
        accesoExpediente.add(a);
    }
    protected void rmAcceso(Acceso a){
        accesoExpediente.remove(a);
    }
    public Enumeration<Acceso> getAccesoExpediente(){
        return Collections.enumeration(accesoExpediente);
    }
}