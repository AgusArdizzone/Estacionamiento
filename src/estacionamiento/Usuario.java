/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

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
    private List<Permiso> permisos;

    public Usuario(String apellido, String nombre, String nombreUsuario, String password) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        permisos = new ArrayList<>();
    }

    Usuario() {
    }
    
    public List<Permiso> conocerPermisos(){
        return permisos;
    }
}
