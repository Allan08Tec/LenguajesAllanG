package Ejercicio1;

import java.util.List;

public class Grupos implements InterfacesObjetos
{
    private String nombre;
    private List<FigurasGeom> objetos;

    public Grupos(String nombre, List<FigurasGeom> objetos)
    {
        this.nombre = nombre;
        this.objetos = objetos;

}
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    //metodo para devolver la lista de objetos
    public List<FigurasGeom> getObjetos()
    {
        return objetos;
    }

    public void setObjetos(List<FigurasGeom> objetos)
    {
        this.objetos = objetos;
    }


    @Override
    public void Imprimir() {
        //imprimir los objetos de la lista de objetos
        for (FigurasGeom objeto : objetos) {
            objeto.Imprimir();
        }

    }
}

