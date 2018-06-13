/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

/**
 *
 * @author agustin
 */
public class Vehiculo {
    private String dominio;
    private Modelo modelo;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String dominio, Modelo modelo, TipoVehiculo tipo) {
        this.dominio = dominio;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    
    public Modelo conocerModelo(){
        return modelo;
    }
}
