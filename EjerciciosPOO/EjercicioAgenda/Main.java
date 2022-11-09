//elaborado por Olman Acuña y Allan Gonzàlez


public class Main {
    public static void main(String[] args) {
        Agenda agendaPersonal = new Agenda();
        System.out.println("***AGREGANDO CONTACTOS***");
        agendaPersonal.agregarContacto(new ContactoT1("Pablo", 20, true, "Calle 1", "123456", "ojgb"));
        agendaPersonal.agregarContacto(new ContactoT1("maria",23,true,"detrás del mercado","77777777","maria@sucorreo.com") );
        agendaPersonal.agregarContacto(new ContactoT2("luis", 30, true, "detras del cementerio", "66666666","luis08","66666666" ));
        System.out.println("***IMPRIMIENDO CONTACTOS***");
        agendaPersonal.imprimirContactos();
        System.out.println("***ELIMINADO CONTACTO MARIA***");
        agendaPersonal.eliminarContacto("maria");
        System.out.println("***IMPRIMIENDO CONTACTOS***");
        agendaPersonal.imprimirContactos();
        System.out.println("***MODIFICAR CONTACTO PABLO***");
        agendaPersonal.modificarContactoT1("pablo",new ContactoT1("pablo",21,false,"a lado al parque","2456354643","x"));
        System.out.println("***IMPRIMIENDO CONTACTOS***");
        agendaPersonal.imprimirContactos();


        agendaPersonal.agregarEvento(new EventoT1("escuela", "2/10/2022", "15:30", "Cumpleaños de la escuela"));
        agendaPersonal.agregarEvento(new EventoT2("TV", "20/11/2022", "12:00", "Mundial de futbol"));

        agendaPersonal.imprimirEventos();
    }
}
