import java.util.*;

public class Profesional {
    private List<Acceso> accesoProfesional;

    public Profesional(){
        this.accesoProfesional = new ArrayList<Acceso>();
    }
    protected void addAcceso(Acceso a){
        this.accesoProfesional.add(a);
    }
    protected void rmAcceso(Acceso a){
        this.accesoProfesional.remove(a);
    }
    public Enumeration<Acceso> getAccesoProfesional(){
        return Collections.enumeration(accesoProfesional);
    }
}