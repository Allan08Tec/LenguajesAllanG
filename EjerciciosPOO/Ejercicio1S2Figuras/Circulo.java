package Ejercicio1;

public class Circulo extends FigurasGeom{

    private int radio;
    private int diametro;

    public Circulo(String nombre , int radio, int diametro) {
        super(nombre);
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
}
