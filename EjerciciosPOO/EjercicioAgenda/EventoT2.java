/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryam
 */

public class EventoT2 extends Evento{
    
    private String medioElectronico;
    
    EventoT2(String medio, String fecha, String hora, String titulo){
        super(fecha, hora, titulo);
        this.medioElectronico=medio;
    }

    @Override
    public void imprimir() {
        EventoT2Frame2 pantalla= new EventoT2Frame2();
        pantalla.txtTitulo.setText(this.getTitle());
        pantalla.txtDate.setText(this.getDate());
        pantalla.txthora.setText(this.getHour());
        pantalla.txtMedio.setText(this.medioElectronico);
        
        pantalla.setVisible(true);
    }
      
    
}
