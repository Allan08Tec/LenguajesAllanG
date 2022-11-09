package Ejercicio1;

import java.util.List;

public class Hojas  implements InterfacesObjetos {

    private String nombre;
    private Grupos objetos;

    public Hojas(String nombre, Grupos objetos) {
        this.nombre = nombre;
        this.objetos = objetos;
    }

    //Metodo para devolver el grupo de objetos
    public Grupos getObjetos() {
        return objetos;
    }



    @Override
    public void Imprimir() {
    //imprimir los elementos del grupo
        objetos.Imprimir();
    }


}

