/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.util.Date;

/**
 *
 * @author agustin
 */
public class AbonoPropietario {
    private Date fecha;
    private Date hora;
    private float montoCobrado;
    private int nroComprobante;
    private float saldoActual;

    public AbonoPropietario() {
    }
    
    public AbonoPropietario(Date fecha, Date hora, float montoCobrado, int nroComprobante, float saldoActual) {
        this.fecha = fecha;
        this.hora = hora;
        this.montoCobrado = montoCobrado;
        this.nroComprobante = nroComprobante;
        this.saldoActual = saldoActual;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }

    public float getSaldoActual() {
        return saldoActual;
    }

    public int getNroComprobante() {
        return nroComprobante;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public void setMontoCobrado(float montoCobrado) {
        this.montoCobrado = montoCobrado;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
    public void conocerIngreso(){
            
    }
    
    public void mostrarFechaYHora(){
        
    }
    
}
