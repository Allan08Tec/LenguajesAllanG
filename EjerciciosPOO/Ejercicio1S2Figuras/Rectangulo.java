package Ejercicio1;

public class Rectangulo extends FigurasGeom{

    private boolean Equilatero ;
    private int NumLados;

    public Rectangulo(String nombre, int NumLados, boolean Equilatero) {
        super(nombre);
        this.NumLados = NumLados;
        this.Equilatero = Equilatero;
    }

    public boolean isEquilatero() {
        return Equilatero;
    }

    public void setEquilatero(boolean Equilatero) {
        this.Equilatero = Equilatero;
    }

    public int getNumLados() {
        return NumLados;
    }

    public void setNumLados(int NumLados) {
        this.NumLados = NumLados;
    }


}
