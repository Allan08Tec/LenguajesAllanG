package VisitorPack;


import Ejercicio1.*;

public interface Visitor {
    public void visitar(Textos t);
    public void visitar(Grupos g);
    public void visitar(Hojas h);
    public void visitar(Documento d);



}
