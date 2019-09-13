/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_diez;

/**
 *
 * @author ANGELO
 */
public class Empleado {
    
    private String name;
    
    
    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empleado{" + "name=" + name + '}';
    }
    
    
    
}
