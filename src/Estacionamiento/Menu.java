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
public class Menu {
    private ProveedorPropietarios provProp = new ProveedorPropietarios();
    private List<Propietario> propietarios = provProp.darListaPropietarios();
    private Scanner scan = new Scanner(System.in);
    private ControladorVistas controlador;
    
    public Menu(ControladorVistas controlador){
        this.controlador=controlador;
    }
    
    public void launch(){
        int seleccion;
        System.out.println("\nIngrese una opcion:");
        System.out.println("1) Agregar saldo a una persona");
        System.out.println("2) Listar Propietarios");
        System.out.println("3) Salir\n");
        seleccion = scan.nextInt();
        switch(seleccion){
            case 1:
                agregarSaldo();
                launch();
            case 2:
                listarPropietarios();
                launch();
            case 3:
                controlador.lanzarInicioSesion();
            default:
                System.out.println("Opcion incorrecta");
                launch();
        }
        
    }
    
    private void listarPropietarios(){
        for (Propietario propietario : propietarios) {
            System.out.println(propietario.toString());
        }
    }
    
    private void agregarSaldo(){
        float monto;
        String dni;
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
                   imprimirComprobante(actualProp);
               }
           }
        }
    }
    
    private boolean userEnBaseDatos(List<Propietario> props, String dni){
        for(Propietario propietario : props){
            if(dni.equals(propietario.getDni())){
                return true;
            }
        }
        return false;
    }
    
    private boolean validarDNI(String dni){
        return !dni.isEmpty();
    }
    
    private void imprimirComprobante(Propietario prop){
        System.out.println("----TICKET----");
        System.out.println("NRO°"+prop.getAbono().getNroComprobante());
        System.out.println("Monto Cargado: "+prop.getAbono().getMontoCobrado());
        System.out.println("Saldo Actual: "+prop.calcularSaldoActual());
    }

    
}
