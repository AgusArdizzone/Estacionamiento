/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento.modelos;

import java.util.Date;

/**
 *
 * @author agustin
 */
public class Ingreso {
    private int codigoBarra;
    private Date fechaEgreso;
    private Date fechaIngreso;
    private Date horaEgreso;
    private Date horaIngreso;
    private float monto;
    private int nroTicket;
    private String observacion;
    private Usuario user;
    private Porton porton;
    private Tarifa tarifa;
    private Vehiculo vehiculo;

    public Ingreso(int codigoBarra, Date fechaEgreso, Date fechaIngreso, Date horaEgreso, Date horaIngreso, float monto, int nroTicket, String observacion) {
        this.codigoBarra = codigoBarra;
        this.fechaEgreso = fechaEgreso;
        this.fechaIngreso = fechaIngreso;
        this.horaEgreso = horaEgreso;
        this.horaIngreso = horaIngreso;
        this.monto = monto;
        this.nroTicket = nroTicket;
        this.observacion = observacion;
    }
    
    public Porton conocerPorton(){
        return porton;
    }
    
    public Tarifa conocerTarifa(){
        return tarifa;
    }
    
    public Usuario conocerUsuario(){
        return user;
    }
    
    public Vehiculo conocerVehiculo(){
        return vehiculo;
    }
    
    public void determinarNroIngreso(int Ingreso){
        
    }
}
