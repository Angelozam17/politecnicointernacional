

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGELO
 */
public class Empleado {
    private String name, surname;
    private byte age;
    private String id;

    //Constructor
    public Empleado(String name, String surname, byte age, String id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }
    
    
    
    //toString

    @Override
    public String toString() {
        return "Hi, " + name + " " + surname + "!\n"
             + "You are " + age + " years old.\n"
             + "Your ID is " + id;
    }
    
    
    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
        
}
