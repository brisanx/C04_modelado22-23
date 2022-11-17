import java.util.*;

public class Profesional {
    private List<Acceso> accesoProfesional;

    public Profesional(){
        accesoProfesional = new ArrayList<Acceso>();
    }
    protected void addAcceso(Acceso a){
        accesoProfesional.add(a);
    }
    protected void rmAcceso(Acceso a){
        accesoProfesional.remove(a);
    }
    public Enumeration<Acceso> getAccesoProfesional(){
        return Collections.enumeration(accesoProfesional);
    }
}
