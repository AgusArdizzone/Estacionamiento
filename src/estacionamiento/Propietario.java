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
public class Propietario {
    private String apellido;
    private String dni;
    private String nombre;

    public Propietario(String apellido, String dni, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public float acreditarMonto(float monto){
        return 0;
    }
    
    public void calcularSaldoActual(){
    
    }
    
    public void ConocerVehiculo(){
        
    }
    
    public void cuantosIngresosPeriodo(){
        
    }
    
    public void obtenerVehiculosPropietario(){
        
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
