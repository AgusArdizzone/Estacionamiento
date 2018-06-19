/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento.modelos;

import java.util.Date;
import java.util.List;

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
    private Propietario propietario;
    private Usuario usuario;
    private List<Ingreso> ingresos;

    public AbonoPropietario() {
    }
    
    public AbonoPropietario(float montoCobrado, int nroComprobante, float saldoActual,Propietario prop) {
       this.montoCobrado = montoCobrado;
        this.nroComprobante = nroComprobante;
        this.saldoActual = saldoActual;
        this.propietario = prop;
        usuario = new Usuario();
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

    public float getMontoCobrado() {
        return montoCobrado;
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
        this.saldoActual += saldoActual;
    }
    
    
    
    public List<Ingreso> conocerIngresos(){
            return this.ingresos;
    }
    
    public void mostrarFechaYHora(){
        
    }
    
}
