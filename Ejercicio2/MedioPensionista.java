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

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		assert(activo != null);
		this.activo = activo;
	}

	public Pensionista getPensionista() {
		return pensionista;
	}

	public void setPensionista(Pensionista pensionista) {
		assert(pensionista != null);
		this.pensionista = pensionista;
	}
    
    
}