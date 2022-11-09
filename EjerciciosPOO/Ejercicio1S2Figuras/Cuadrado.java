package Ejercicio1;

public class Cuadrado extends FigurasGeom {
    private boolean perfecto;

    public Cuadrado(String nombre, boolean perfecto) {
        super(nombre);
        this.perfecto = perfecto;
    }

    public boolean isPerfecto() {
        return perfecto;
    }

    public void setPerfecto(boolean perfecto) {
        this.perfecto = perfecto;
    }



}
