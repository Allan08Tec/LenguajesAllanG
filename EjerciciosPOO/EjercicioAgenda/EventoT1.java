/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryam
 */
public class EventoT1 extends Evento{
    private String lugarEvento;
    
    EventoT1(String lugarEvento, String fecha, String hora, String titulo){
        super(fecha, hora, titulo);
        this.lugarEvento=lugarEvento;
    }

    @Override
    public void imprimir() {
        EventoT1Frame1 pantalla= new EventoT1Frame1();
        pantalla.txtTitulo.setText(this.getTitle());
        pantalla.txtDate.setText(this.getDate());
        pantalla.txthora.setText(this.getHour());
        pantalla.txtLugar.setText(this.lugarEvento);
        
        pantalla.setVisible(true);
    }
    
    
    
}
