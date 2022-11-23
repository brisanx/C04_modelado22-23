package Ejercicio3;

public class Full extends Estado{

    public Full(Bandeja bandeja){
        super(bandeja);
    }

    @Override
    public void put(Pieza p){}

    @Override
    public Pieza get(){
        if(bandeja.getCapacidad() == 1){
            bandeja.cambiarEstado(new Empty(bandeja));
        } else {
            bandeja.cambiarEstado(new Normal(bandeja));
        }
        //La pieza que quitamos ya no está en ninguna bandeja
        bandeja.cola.poll().setBandeja(null);
        return bandeja.cola.poll();
    }
    
}
