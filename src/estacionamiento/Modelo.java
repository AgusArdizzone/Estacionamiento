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
public enum Modelo {
    CORSA_XLS(Marca.RENAULT, 23);
    
    private Marca marca;
    private int codigo;

    Modelo(Marca marca, int codigo){
    this.marca = marca;
    this.codigo = codigo;
    }
}
