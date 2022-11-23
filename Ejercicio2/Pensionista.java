package Ejercicio2;

public class Pensionista extends Trabajador{
    
    public Pensionista(String nombre, String nSS, Double salario){
        super(nombre, nSS, salario);
    }

    public void incrementar(){salario = salario * 1.04;}
}
