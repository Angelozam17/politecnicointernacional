package vehiculo_2;
import javax.swing.*;

public class Vehiculo {
    
    private String marca, modelo;
    private int velocidad;
    private boolean encendido = false;
    
    public Vehiculo(){
        while(true){
            String res = JOptionPane.showInputDialog("¿Qué deseas hacer? \n" +
                                                  "A. Encender \n" +
                                                  "B. Acelerar \n" +
                                                  "C. Frenar \n" +
                                                  "D. Apagar");
            
            if(res.equals("A") || res.equals("Encender") && encendido == false){
                encendido = true;   
                System.out.println("Se ha encendido el vehículo.");
                
            }else if(res.equals("A") || res.equals("Encender") && encendido == true){
                System.out.println("El auto ya está encendido.");
            }
        }
          
                              
    }
    
    public void acelerar(){
        while(encendido && velocidad <= 200){
            System.out.println(velocidad + "km/h");
            velocidad++;

        }
    }
    
    public void frenar(){
        while(encendido && velocidad == 200){
            System.out.println(velocidad + "km/h");
            velocidad--;
        }
    }        
}