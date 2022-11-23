package Ejercicio3;

public class Normal extends Estado{
    
    public Normal( Bandeja bandeja ){
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
        assert(p!=null);
        if (bandeja.cola.size() < bandeja.getCapacidad() - 1) {
            bandeja.cola.add(p);
        } else {
            bandeja.cola.add(p);
            bandeja.cambiarEstado(new Full(bandeja));
        }
        p.setBandeja(bandeja);
    }

    public Pieza get(){
        Pieza p;
        if( bandeja.cola.size() == 1 ){
            p = bandeja.cola.poll();
            bandeja.cambiarEstado( new Empty(bandeja) );
        }else{
            p = bandeja.cola.poll();
        }
        p.setBandeja(null);
        return p;
    }

}