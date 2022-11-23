package Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
    private Estado estado;
    private final int capacidad;
    Queue<Pieza> cola;

    public Bandeja(int capacidad){
        assert(capacidad > 0);
        this.capacidad = capacidad;
        this.estado = new Empty(this);
        this.cola = new LinkedList<>();
    }
    
    void cambiarEstado(Estado e){
        this.estado = e;
    }

    public void put(Pieza p) {
        estado.put(p);
    }

    public Pieza get(){
        return estado.get();
    }

    public int size() {
        return estado.size();
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    

}