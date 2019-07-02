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
public class Masajista extends SoccerGroup{
    String titulacion;
    int aniosExperencia;

    @Override
    public void entrenamiento() {
        System.out.println("Dar asistencia a los jugadores - Masajista");
    }
    
    public void darMasaje(){
        System.out.println("Dar masaje - Masajista");
    }

    @Override
    public void show() {
        System.out.println("Nombre: " + name + "\n" +
                           "Apellido: " + surname + "\n" +
                           "Id: " + id + "\n" +
                           "Titulación: " + titulacion + "\n" + 
                           "Años de experiencia: " + aniosExperencia + "\n");
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperencia(int aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    }
    
    
}
