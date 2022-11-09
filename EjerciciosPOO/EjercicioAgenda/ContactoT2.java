public class ContactoT2 extends Contacto{
    private String facebook;
    private String telegram;

    public ContactoT2(Persona persona, String direccion, String telefono, String facebook, String telegram) {
        super(persona, direccion, telefono);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    public ContactoT2(String nombre, int edad, boolean genero, String direccion, String telefono, String facebook, String telegram) {
        super(nombre, edad, genero, direccion, telefono);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    @Override
    public void imprimir(){
        ContactoT2Frame2 pantalla = new ContactoT2Frame2();
        pantalla.txtFacebook.setText(this.facebook);
        pantalla.txtInstagram.setText(this.telegram);
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
        return "ContactoT2{" +
                "facebook='" + facebook + '\'' +
                ", telegram='" + telegram + '\'' +
                "} " + super.toString();
    }
}
