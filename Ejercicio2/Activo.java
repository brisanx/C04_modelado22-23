package Ejercicio2;

public class Activo extends Trabajador{

    public Activo (String nombre, String nSS, Double salario){
        super(nombre,nSS, salario);
    }

    @Override
    public void incrementar(){salario = salario * 1.02;}
}