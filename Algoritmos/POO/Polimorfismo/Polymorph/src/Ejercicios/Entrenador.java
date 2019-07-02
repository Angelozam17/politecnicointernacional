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
public class Entrenador extends SoccerGroup{
    private int idFederacion;
    
    @Override
    public void entrenamiento(){
        System.out.println("Dirije el juego - entrenador");
    }
    
    @Override
    public void partido(){
        System.out.println("Planificar entrenamiento - entrenador");
    }

    @Override
    public void show() {
        System.out.println("Nombre: " + name + "\n" +
                                            "Apellido: " + surname + "\n" +
                                            "Id: " + id + "\n" + 
                                            "ID federacion: " + idFederacion + "\n");
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
}
