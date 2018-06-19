/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento;

/**
 *
 * @author agustin
 */
public class ControladorVistas {
    private Menu menu = new Menu(this);
    private InicioSesion inicio= new InicioSesion(this);
    
    public void seleccionarMenuUsuario(String nombrePermiso){
        if(nombrePermiso.equals("responsable")){
            lanzarMenuResponsable();
        }else if(nombrePermiso.equals("cajero")){
            lanzarMenuCajero();
        }
    }
    
    public void lanzarInicioSesion(){
        inicio.launch();
    }
    
    public void lanzarMenuResponsable(){
        menu.launch();
    }
    
    public void lanzarMenuCajero(){
        System.out.println("Menu cajero");
    }
}
