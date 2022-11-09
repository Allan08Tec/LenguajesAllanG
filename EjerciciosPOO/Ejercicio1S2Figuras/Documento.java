package Ejercicio1;

import java.util.List;

public class Documento implements InterfacesObjetos{

    private String nombre;
    private List<Hojas> hojas = List.of(new Hojas("Hoja1", new Grupos("Grupo1", List.of(new FigurasGeom("Figura1"), new FigurasGeom("Figura2")))));

    public Documento(String nombre, List<Hojas> hojas) {
        this.nombre = nombre;
        this.hojas = hojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo para agregar hojas a un documento


    //metodo para devolver la lista de hojas
    public List<Hojas> getHojas() {
        return hojas;
    }

    @Override
    public void Imprimir() {
    //imprimir las hojas del documento
        for (Hojas hoja : hojas) {
            hoja.Imprimir();
        }

    }
}
