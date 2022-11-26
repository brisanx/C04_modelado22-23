package Ejercicio2;

public abstract class Trabajador {

    private String nombre;
    private String numeroSeguridadSocial;
    protected Double salario;

    public Trabajador(String nombre, String nSS, Double salario) {
        assert(nombre!=null);
        assert(nSS!=null);
        assert(salario > 0);
        
        setNombre(nombre);
        setNumeroSeguridadSocial(nSS);
        setNomina(salario);
    }

    public double nomina(){return this.salario;}
    public abstract void incrementar();
    

    public String getNombre() {return this.nombre;}
    
    private void setNombre(String nombre){
        assert(nombre!=null);
        this.nombre = nombre;
    }
    
    public String getNumeroSeguridadSocial() {return this.numeroSeguridadSocial;}
    
    private void setNumeroSeguridadSocial(String nSS){
        assert(nSS != null);
        this.numeroSeguridadSocial = nSS;
    }

    protected void setNomina(double salario){
        assert(salario > 0);
        this.salario = salario;
    }
    
}
