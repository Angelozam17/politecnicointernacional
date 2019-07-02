/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Usuario
 */
public class OExample_1 {
    public static void main(String[] args){
        Player Angelo = new Player();
        Angelo.setDorsal(15);
        Angelo.setDemarcacion(89);
        Angelo.show();
        
        
        Entrenador Johan = new Entrenador();
        Johan.setIdFederacion(123);
        Johan.show();
        
        
        Masajista Cala = new Masajista();
        Cala.setTitulacion("Lc. Educación Física");
        Cala.setAniosExperencia(12);
        Cala.show();      
    }
}
