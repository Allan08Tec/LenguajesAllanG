/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryam
 */
public abstract class Evento {
    
    private String fechaEvento;
    private String horaEvento;
    private String tituloEvento;
   
    Evento(String date, String hour, String titulo){
        this.fechaEvento=date;
        this.horaEvento=hour;
        this.tituloEvento=titulo;
    }
    public String getHour(){
        return this.horaEvento;
    }
    public String getDate(){
        return this.fechaEvento;
    }
    public String getTitle(){
        return this.tituloEvento;
    }
    public abstract void imprimir();
}
