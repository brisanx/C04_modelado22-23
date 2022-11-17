import java.util.*;

public class Acceso {
    Date fecha;
    TipoAcceso tipo;
    Profesional profesional;
    Expediente expediente;

    public Acceso(Date f, TipoAcceso tAcceso, Profesional prof, Expediente exp) throws AssertionError{
       // asserts
        assert(f != null);
        assert(tAcceso != null);
        assert(prof != null);
        assert(exp != null);
        
        //constructor
        this.fecha=f;
        this.tipo = tAcceso;
        this.profesional = prof;
        this.expediente = exp;
    }

    public Date getFecha() {return this.fecha;}

    void setFecha(Date f) {this.fecha = f;}

    public TipoAcceso getTipoAcceso() {return this.tipo;}
    
    void setTipoAcceso(TipoAcceso tA) {this.tipo = tA;}

    public Profesional getProfesional() {return this.profesional;}
    
    void setProfesional(Profesional p) {this.profesional = p;}

    public Expediente getExpediente() {return this.expediente;}
    
    void setExpediente(Expediente e) {this.expediente = e;}

    @Override
    public String toString() {
        return expediente + ";";
    }
}
