/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento;

import estacionamiento.modelos.Propietario;
import java.util.ArrayList;
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
        List<Propietario> propietarios = new ArrayList<>();
        Propietario juan = new Propietario("Perez", "1", "Juan");
        propietarios.add(juan);
        float monto;
        String dni;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese DNI del propietario");
        dni = scan.next();
        if(validarDNI(dni)){
           if(userEnBaseDatos(propietarios,dni)){
               System.out.println("Ingrese monto a acreditar");
               monto = scan.nextFloat();
               if(monto<=0){
                   System.out.println("monto no valido");
               }else{
                   System.out.println("Acreditara $"+monto+" a su cuenta");
                   juan.acreditarMonto(monto);
                   System.out.println("Su saldo actual es: "+ juan.calcularSaldoActual());
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
