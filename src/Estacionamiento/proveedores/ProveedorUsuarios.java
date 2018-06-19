/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento.proveedores;

import estacionamiento.modelos.Permiso;
import estacionamiento.modelos.Propietario;
import estacionamiento.modelos.Usuario;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author agustin
 */
public class ProveedorUsuarios {
    private Permiso responsable = new Permiso("es el Responsable", "responsable");
    private Permiso cajero = new Permiso("es el cajero", "cajero");
            
    private List<Usuario> usuarios = Arrays.asList(
        new Usuario("Perez", "Juan", "JP", "1234",responsable),
        new Usuario("Perez", "Facu", "FP", "123",cajero));

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
}
