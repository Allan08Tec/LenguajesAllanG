public abstract class Contacto{
    private Persona persona;
    private String direccion;
    private String telefono;

    public Contacto(Persona persona, String direccion, String telefono) {
        this.persona = persona;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Contacto(String nombre, int edad, boolean genero, String direccion, String telefono) {
        this.persona = new Persona(nombre,edad,genero);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Persona getPersona() {
        return persona;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }

    public void modificarCT1(Contacto c){
        this.persona = c.getPersona();
        this.direccion = c.getDireccion();
        this.telefono = c.getTelefono();
        super
    }
    public abstract void imprimir();



}
