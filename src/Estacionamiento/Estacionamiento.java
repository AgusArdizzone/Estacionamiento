/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento;

import Estacionamiento.proveedores.ProveedorPropietarios;
import estacionamiento.modelos.Propietario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author agustin
 */
public class Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProveedorPropietarios provProp = new ProveedorPropietarios();
        List<Propietario> propietarios = provProp.darListaPropietarios();
        
        float monto;
        String dni;
        Scanner scan = new Scanner(System.in);
        Propietario actualProp;
        System.out.println("Ingrese DNI del propietario");
        dni = scan.next();
        if(validarDNI(dni)){
           if(userEnBaseDatos(propietarios,dni)){
               actualProp = provProp.buscarPropietario(dni);
               System.out.println("Ingrese monto a acreditar");
               monto = scan.nextFloat();
               if(monto<=0){
                   System.out.println("monto no valido");
               }else{
                   System.out.println("Acreditara $"+monto+" a su cuenta");
                   actualProp.acreditarMonto(monto);
                   System.out.println("Su saldo actual es: "+ actualProp.calcularSaldoActual());
               }
           }
        }
    }
    
    public static boolean userEnBaseDatos(List<Propietario> props, String dni){
        for(Propietario propietario : props){
            if(dni.equals(propietario.getDni())){
                return true;
            }
        }
        return false;
    }
    
    public static boolean validarDNI(String dni){
        return !dni.isEmpty();
    }
    
}
