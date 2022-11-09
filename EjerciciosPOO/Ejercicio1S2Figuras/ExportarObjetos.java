package VisitorPack;

import Ejercicio1.*;

public class ExportarObjetos implements  Visitor{


    @Override
    public void visitar(Textos t) {
        System.out.println("Exportando Texto: "+t.getTexto());

    }

    @Override
    public void visitar(Grupos g) {
        System.out.println("Exportando Grupo: "+g.getObjetos().toString());

    }


    @Override
    public void visitar(Hojas h) {
        System.out.println("Exportando Hoja: "+h.getObjetos().toString());

    }

    @Override
    public void visitar(Documento d) {
        System.out.println("Exportando Documento: "+d.getHojas().toString());

    }
}
