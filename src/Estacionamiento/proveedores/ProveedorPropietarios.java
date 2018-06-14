/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento.proveedores;

import estacionamiento.modelos.Propietario;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author agustin
 */
public class ProveedorPropietarios {
        private List<Propietario> propietarios = Arrays.asList(
        new Propietario("Perez", "1", "Juan"),
        new Propietario("Asdw", "2", "asd",10f));
      
      public List<Propietario> darListaPropietarios(){
        return propietarios;
      }
      
      public Propietario buscarPropietario(String dni){
          for (Propietario propietario : propietarios) {
              if(dni.equals(propietario.getDni())) {
                  return propietario;
              }
          }
          return null;
      }
}
