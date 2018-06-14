/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento.modelos;

/**
 *
 * @author agustin
 */
public class TipoVehiculo {
    private String descripcion; 
    private String nombre;
    private Tarifa tarifa;

    public TipoVehiculo(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        tarifa = new Tarifa(this);
    }
    
    
}
