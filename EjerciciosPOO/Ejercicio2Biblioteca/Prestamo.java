package Package;

public class Prestamo {
    private String CodeSocio;
    private String CodeLibro;
    private String FechaPrestamo;

    public Prestamo(String CodeSocio, String CodeLibro, String FechaPrestamo) {
        this.CodeSocio = CodeSocio;
        this.CodeLibro = CodeLibro;
        this.FechaPrestamo = FechaPrestamo;
    }

    public String getCodeSocio() {
        return CodeSocio;
    }

    public String getCodeLibro() {
        return CodeLibro;
    }

    public String getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setCodeSocio(String CodeSocio) {
        this.CodeSocio = CodeSocio;
    }

    public void setCodeLibro(String CodeLibro) {
        this.CodeLibro = CodeLibro;
    }

    public void setFechaPrestamo(String FechaPrestamo) {
        this.FechaPrestamo = FechaPrestamo;
    }


    //metodo para imprimir Prestamo
    public void imprimirPrestamo(){
        System.out.println("Codigo de Socio: "+CodeSocio);
        System.out.println("Codigo de Libro: "+CodeLibro);
        System.out.println("Fecha de Prestamo: "+FechaPrestamo);
    }

    //metodo override de toString
    @Override
    public String toString() {
        return "Prestamo{" + "CodeSocio=" + CodeSocio + ", CodeLibro=" + CodeLibro + ", FechaPrestamo=" + FechaPrestamo + '}';
    }

}
