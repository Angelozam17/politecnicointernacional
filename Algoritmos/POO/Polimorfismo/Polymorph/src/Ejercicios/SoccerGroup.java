package Ejercicios;
import javax.swing.*;
/**
 *
 * @author Angelo Zambrano
 */
public abstract class SoccerGroup {
    
    protected int age;
    protected String name, surname, id;

    public SoccerGroup(){
        name = JOptionPane.showInputDialog("Digita tu nombre");
        surname = JOptionPane.showInputDialog("Digita tu apellido");
        id = JOptionPane.showInputDialog("Digita tu ID");
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
    public void viajar(){
        System.out.println("Viajar - Padre ");
    }
    
    public void concentrarse(){
        System.out.println("Concentrarse - Padre");
    }
    
    public abstract void entrenamiento();
    
    public void partido(){
        System.out.println("Hola estoy en el partido - Padre");
    }
    
    public abstract void show();
}