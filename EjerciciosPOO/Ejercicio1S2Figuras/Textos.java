package Ejercicio1;

public class Textos implements InterfacesObjetos {

    protected String nombre;
    protected String texto;

    public Textos(String nombre, String texto) {
        super();
        this.nombre = nombre;
        this.texto = texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



    @Override
    public void Imprimir() {

    }
}

