package Ejercicio3;
public class Empty extends Estado{

    public Empty (Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
        assert(p!=null);
        if (bandeja.getCapacidad() == 1) {
            bandeja.cola.add(p);
            bandeja.cambiarEstado(new Full(bandeja));
        } else {
            bandeja.cola.add(p);
            bandeja.cambiarEstado(new Normal(bandeja));
        }
        p.setBandeja(bandeja);
    }

    public Pieza get(){
        return null;
    }
}
