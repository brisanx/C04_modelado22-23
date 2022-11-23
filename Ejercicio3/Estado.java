package Ejercicio3;

public abstract class Estado {
    protected Bandeja bandeja;

    public Estado(Bandeja b) {
        assert (b != null);
        this.bandeja = b;
    }

    public abstract void put(Pieza p);
    public abstract Pieza get();
    public Integer size() {
        return bandeja.cola.size();
    }
}