import java.util.LinkedList;

public class Agenda {
    private LinkedList<Contacto> contactos;
    private LinkedList<Evento> eventos;

    public Agenda() {
        this.contactos = new LinkedList<Contacto>();
        this.eventos = new LinkedList<Evento>();
    }

    //Agregar Contacto
    public void agregarContacto(Contacto c){
        this.contactos.add(c);
    }
    public void agregarEvento(Evento e){
        this.eventos.add(e);
    }
    //Eliminar Contacto
    public void eliminarContacto(int index){
        this.contactos.remove(index);
    }
    public void eliminarContacto(String nombre){
        for(Contacto c : this.contactos){
            if (c.getPersona().getNombre().equals(nombre))
                this.contactos.remove(c);
        }
    }
    //modificar Contacto
    public void modificarContactoT1(String nombre, ContactoT1 c) {
        for(Contacto q: this.contactos){
            if (q.getPersona().getNombre().equals(nombre))
                q.modificarCT1(c);
        }
    }



    //imprimirContactos
    public void imprimirContactos(){
        for(Contacto c : this.contactos)
            c.imprimir();
    }
    //imprimirEventos
    public void imprimirEventos(){
        for(Evento e : this.eventos)
            e.imprimir();
    }
}
