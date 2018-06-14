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
public class Tarifa {
    private int cantidadIngresosSinSaldo;
    private boolean esDeAbono;
    private Date fecha;
    private float montoIngreso;
    private TipoVehiculo tipovehiculo;

    public Tarifa(int cantidadIngresosSinSaldo, boolean esDeAbono, Date fecha, float montoIngreso) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.esDeAbono = esDeAbono;
        this.fecha = fecha;
        this.montoIngreso = montoIngreso;
    }

    Tarifa(TipoVehiculo tipo) {
        this.tipovehiculo = tipo;
    }
    
    public TipoVehiculo conocerTipoVehiculo(){
        return tipovehiculo;
    }
}
