/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento;

import Estacionamiento.proveedores.ProveedorUsuarios;
import estacionamiento.modelos.Usuario;
import java.util.Scanner;

/**
 *
 * @author agustin
 */
public class InicioSesion {
    private Scanner scan = new Scanner(System.in); 
    private ProveedorUsuarios prov= new ProveedorUsuarios();
    private ControladorVistas controlador;
    
    public InicioSesion(ControladorVistas controlador){
        this.controlador= controlador;
    }
    
    public void launch(){
        boolean malIngreso= false;
        String user;
        String pass;
        System.out.println("Ingrese su user:");
        user= scan.next();
        System.out.println("Ingrese su pass");
        pass=scan.next();
        
        for(Usuario usuario : prov.getUsuarios()){
            if(user.equals(usuario.getNombreUsuario()) && pass.equals(usuario.getPassword())){
               controlador.seleccionarMenuUsuario(usuario.conocerPermiso().getNombre());
            }
        }
        malIngreso=true;
        
        if(malIngreso){
            System.out.println("El user o pass fueron mal ingresados");
            launch();
        }
        
        
        
        
    }
}
