package Package;

public class Libro {
    private String titulo;
    private String autor;
    private String Codigo;
    private boolean disponible = true;

    public Libro(String titulo, String autor, String Codigo, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.Codigo = Codigo;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return Codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //metodo para imprimir Libro
    public void imprimirLibro(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Codigo: "+Codigo);
        System.out.println("Disponible: "+disponible);
    }

    //metodo override de toString
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", Codigo=" + Codigo + ", disponible=" + disponible + '}';
    }

}
