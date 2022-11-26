package Ejercicio2;

public class MedioPensionista extends Trabajador{
    
    private Activo activo;
    private Pensionista pensionista;

    public MedioPensionista(String nombre, String nSS, Double salActivo, Double salPensionista){
        super(nombre, nSS, salActivo+salPensionista);
        this.activo = new Activo(nombre, nSS, salActivo);
        this.pensionista = new Pensionista(nombre, nSS, salPensionista);
    }

    @Override
    public void incrementar() {
        activo.incrementar();
        pensionista.incrementar();
        setNomina(activo.nomina() + pensionista.nomina());
    }
}