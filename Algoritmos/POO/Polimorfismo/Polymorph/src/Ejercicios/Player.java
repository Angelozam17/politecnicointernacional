package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Player extends SoccerGroup {
    private int dorsal;
    private int demarcacion;

    @Override
    public void entrenamiento() {
        System.out.println("Entrenaar - player");
    }
    
    @Override
    public void partido(){
        System.out.println("Juega un partido - player");
    }
    
    @Override
    public void show(){
        System.out.println("Nombre: " + name + "\n" +
                                            "Apellido: " + surname + "\n" +
                                            "Id: " + id + "\n" + 
                                            "Dorsal: " + dorsal + "\n" + 
                                            "Demarcación: " + demarcacion + "\n");
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(int demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    
}
