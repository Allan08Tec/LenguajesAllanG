public class Persona {
    private String nombre;
    private int edad;
    private boolean genero; //true = mujer; false = hombre

    public Persona(String nombre, int edad, boolean genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
     public int getEdad() {
        return edad;
    }
      public boolean getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }
}
