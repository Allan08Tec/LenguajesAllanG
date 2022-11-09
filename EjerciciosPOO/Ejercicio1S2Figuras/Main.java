import Ejercicio1.*;
import VisitorPack.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Crear las figuras geométricas


        FigurasGeom cuadrado = new Cuadrado("Cuadrado", false);
        FigurasGeom circulo = new Circulo("Circulo", 3, 4);
        FigurasGeom Lineas = new Lineas("Lineas", 3, true);
        FigurasGeom Elipses = new Elipses("Elipse", 3, 4, 5);
        FigurasGeom Rectangulo = new Rectangulo("Rectangulo", 3,true);
        FigurasGeom cuadrado2 = new Cuadrado("Cuadrado2", true);
        FigurasGeom circulo2 = new Circulo("Circulo2", 5, 6);

        //Crear los grupos
        List<FigurasGeom> ListaFiguras = List.of(cuadrado, circulo, Lineas, Elipses, Rectangulo);
        List<FigurasGeom> ListaFiguras2 = List.of(cuadrado2, circulo2);




        //Crear los grupos
        Grupos grupo1 = new Grupos("Grupo1",ListaFiguras);
        Grupos grupo2 = new Grupos("Grupo2",ListaFiguras2);

        //Crear las hojas
        Hojas hoja1 = new Hojas("Hoja1", grupo1);
        Hojas hoja2 = new Hojas("Hoja2", grupo2);

        //Crear el documento
        Documento documento = new Documento("Documento1", List.of(hoja1, hoja2));


        //usar el visitor para imprimir el documento
        ExportarObjetos exportarObjetos = new ExportarObjetos();
        exportarObjetos.visitar(documento);











    }
}



