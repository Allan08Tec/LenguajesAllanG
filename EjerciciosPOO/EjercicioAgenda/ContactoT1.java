public class ContactoT1 extends Contacto{
    private String correo;

    public ContactoT1(Persona persona, String direccion, String telefono, String correo) {
        super(persona, direccion, telefono);
        this.correo = correo;
    }

    public ContactoT1(String nombre, int edad, boolean genero, String direccion, String telefono, String correo) {
        super(nombre, edad, genero, direccion, telefono);
        this.correo = correo;
    }

    
    public void modificarCT1(ContactoT1 c){
        this.correo = c.correo;
    }

    @Override
    public void imprimir(){
        //System.out.println("CONTACTO1 : " + this.toString());
        ContactoT1Frame pantalla = new  ContactoT1Frame();
        pantalla.txtCorreo.setText(this.correo);
        Persona p=this.getPersona();
        pantalla.txtNombre.setText(p.getNombre());
        pantalla.txtEdad.setText(String.valueOf(p.getEdad()));
        pantalla.txtGenero.setText(String.valueOf(p.getGenero()));
        pantalla.txtDireccion.setText(this.getDireccion());
        pantalla.txtTelefono.setText(this.getTelefono());
        
        pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "ContactoT1{" +
                super.toString() + '\'' +
                "correo='" + correo + '\'' +
                '}';
    }
}
