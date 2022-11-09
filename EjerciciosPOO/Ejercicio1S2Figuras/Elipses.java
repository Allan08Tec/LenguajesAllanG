package Ejercicio1;

public class Elipses extends FigurasGeom{
    private int ejeX;
    private int ejeY;
    private int Curvatura;



    public Elipses(String nombre,  int ejeX, int ejeY, int Curvatura) {
        super(nombre);
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.Curvatura = Curvatura;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }


}
