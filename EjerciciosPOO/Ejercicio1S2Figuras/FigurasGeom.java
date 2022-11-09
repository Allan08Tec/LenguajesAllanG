package Ejercicio1;

public class FigurasGeom implements InterfacesObjetos  {

    protected String nombre;




    public FigurasGeom(String nombre ) {
        super();
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }




    @Override
    public void Imprimir() {

    }
}

