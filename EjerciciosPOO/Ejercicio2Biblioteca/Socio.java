package Package;

public class Socio {
    private String nombre;
    private String direccion;
    private int numSocio = 0;

    private int numLibrosAdquiridos;

    public Socio(String nombre, String direccion, int numSocio,int numLibrosAdquiridos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numSocio = numSocio;
        this.numLibrosAdquiridos = numLibrosAdquiridos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public int getNumLibrosAdquiridos() {
        return numLibrosAdquiridos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public void setNumLibrosAdquiridos(int numLibrosAdquiridos) {
        this.numLibrosAdquiridos = numLibrosAdquiridos;
    }

    //metodo para imprimir Socio
    public void imprimirSocio(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Numero de Socio: "+numSocio);
        System.out.println("Numero de Libros Adquiridos: "+numLibrosAdquiridos);
    }

    //metodo override de toString
    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", direccion=" + direccion + ", numSocio=" + numSocio + ", numLibrosAdquiridos=" + numLibrosAdquiridos + '}';
    }
}
