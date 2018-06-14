/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agustin
 */
public class Propietario {
    private String apellido;
    private String dni;
    private String nombre;
    private AbonoPropietario abono;
    private List<Vehiculo> vehiculos;

    public Propietario(String apellido, String dni, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
        this.abono = new AbonoPropietario();
        vehiculos = new ArrayList<>();
    }

    public Propietario() {
    }
    
    public void acreditarMonto(float monto){
        this.abono.setSaldoActual(monto);
    }
    
    public float calcularSaldoActual(){
       return this.abono.getSaldoActual();
    }
    
    public void ConocerVehiculo(){
        
    }
    
    public int cuantosIngresosPeriodo(){
        return this.abono.conocerIngresos().size();
    }
    
    public List<Vehiculo> obtenerVehiculosPropietario(){
        return this.vehiculos;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
