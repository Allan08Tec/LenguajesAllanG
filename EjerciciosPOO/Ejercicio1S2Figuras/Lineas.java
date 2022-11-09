package Ejercicio1;

public class Lineas extends FigurasGeom{
    private int cantidadLineas;
    private boolean rectas;

    public Lineas(String nombre, int cantidadLineas, boolean rectas) {
        super(nombre);
        this.cantidadLineas = cantidadLineas;
        this.rectas = rectas;
    }

    public int getCantidadLineas() {
        return cantidadLineas;
    }

    public void setCantidadLineas(int cantidadLineas) {
        this.cantidadLineas = cantidadLineas;
    }

}
