import Package.*;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

   //metodo para buscar un libro por codigo
    public static Libro buscarLibro(String codigo, List<Libro> libros){
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    //validar que un socio no pueda tener màs de 3 libros prestados usando la funcion Filter
    public static boolean validarSocio(String codigo, List<Prestamo> prestamos){
        return prestamos.stream().filter(prestamo -> prestamo.getCodeSocio().equals(codigo)).count() < 3;
    }


    public static void hacerPrestamo(List<Libro> libros, List<Prestamo> prestamos, String CodeSocio, String CodeLibro, String FechaPrestamo){
        //buscamos el libro
        Libro libro = buscarLibro(CodeLibro, libros);
        //buscar el socio y validar que no tenga mas de 3 libros prestados
        if (libro != null && libro.isDisponible() && validarSocio(CodeSocio, prestamos)) {
            //si el libro esta disponible y el socio no tiene mas de 3 libros prestados
            //creamos el prestamo
            Prestamo prestamo = new Prestamo(CodeSocio, CodeLibro, FechaPrestamo);
            //agregamos el prestamo a la lista de prestamos
            prestamos.add(prestamo);
            //cambiamos el estado del libro a no disponible
            libro.setDisponible(false);
            System.out.println("Prestamo realizado con exito");
        }else{
            System.out.println("El libro no existe o no esta disponible o el socio ya tiene 3 libros prestados");
        }
    }

    //funcion para imprimir los libros disponibles
    public static void imprimirLibrosDisponibles(List<Libro> libros){
        for (Libro libro : libros) {
            if(libro.isDisponible()){
                System.out.println(libro);
            }
        }
    }





    public static void main(String[] args) {
        //Crear los Socios
       Socio socio1 = new Socio("Juan", "Santa Clara", 1, 0);
       Socio socio2 = new Socio("Pedro", "Florencia", 2, 0);
       Socio socio3 = new Socio("Maria", "Florencia", 3, 0);
       Socio socio4 = new Socio("Luis", "Snata Clara", 4, 0);
       Socio socio5 = new Socio("Ana", "Cuestillas", 5, 0);

       //Crear una lista de Socios
       List<Socio> socios = List.of(socio1, socio2, socio3, socio4, socio5);

       //Crear los Libros
       Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "A1", true);
       Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "A2", true);
       Libro libro3 = new Libro("El Alquimista", "Paulo Coelho", "A3", true);
       Libro libro4 = new Libro("El Poder", "Rhonda Byrne", "A4", true);
       Libro libro5 = new Libro("Los juegos del hambre", "Susane Collince", "A5", true);
       Libro libro6 = new Libro("Los juegos del hambre en llamas", "Susane Collince", "A6", true);
       Libro libro7 = new Libro("Los juegos del hambre sinsajo part1", "Susane Collince", "A7", true);
       Libro libro8 = new Libro("Los juegos del hambre sinsaho part2", "Susane Collince", "A8", true);
       Libro libro9 = new Libro("Harry potter y la piedra filosofal", "LK Rouling", "A9", true);

       //Crear una lista de Libros
       List<Libro> libros = List.of(libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8, libro9);

       //crear e inicializar una lista de prestamos
       List<Prestamo> prestamos = new ArrayList<>();


       System.out.println("Libros disponibles");
       imprimirLibrosDisponibles(libros);
       System.out.println("");



      //hacer prestamos
       hacerPrestamo(libros, prestamos, "1", "A5", "2021-05-01");
       hacerPrestamo(libros, prestamos, "1", "A6", "2021-05-01");
       hacerPrestamo(libros, prestamos, "1", "A7", "2021-05-01");
       hacerPrestamo(libros, prestamos, "1", "A8", "2021-05-01");
       hacerPrestamo(libros, prestamos, "2", "A6", "2021-05-01");
       hacerPrestamo(libros, prestamos, "2", "A8", "2021-05-01");

       System.out.println("Libros disponibles");
       imprimirLibrosDisponibles(libros);
       System.out.println("");
    }
}