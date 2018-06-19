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
public class Usuario {
    private String apellido;
    private String nombre;
    private String nombreUsuario;
    private String password;
    private Permiso permiso;

    public Usuario(String apellido, String nombre, String nombreUsuario, String password,Permiso perm) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permiso= perm;
    }

    Usuario() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    public Permiso conocerPermiso(){
        return permiso;
    }
}
