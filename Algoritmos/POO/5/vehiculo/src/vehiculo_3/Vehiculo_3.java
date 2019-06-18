package vehiculo_3;
import javax.swing.*;

public final class Vehiculo_3 {
    
    String marca, modelo;
    int velocidad = 0;
    boolean encendido = false;
    
    public Vehiculo_3(){
        
        while(true){
            String res = JOptionPane.showInputDialog(null, "¿Qué deseas hacer? \n" +
                                                  "A. Encender \n" +
                                                  "B. Acelerar \n" +
                                                  "C. Frenar \n" +
                                                  "D. Apagar");
            //ENCENDER
            if((res.equals("A") || res.equals("Encender")) && encendido == false && velocidad == 0){
                encendido = true;   
                System.out.println("Se ha encendido el vehículo."); 
                
            }else if((res.equals("A") || res.equals("Encender")) && encendido == true && velocidad == 0){
                System.out.println("El auto ya está encendido.");
                
            }else if((res.equals("A") || res.equals("Encender")) && velocidad >= 200){
                System.out.println("No puede apagar ni encender el velículo mientras está acelerando.");
            }
            
            
            
            //ACELERAR
            if((res.equals("B") || res.equals("Acelerar")) && encendido == true){
                System.out.println("Ha acelerado.");
                acelerar();
                System.out.println("Está apunto de sobrepasar el límite de velocidad. \nDebe frenar.");
                
            }else if((res.equals("B") || res.equals("Acelerar")) && encendido == false){
                System.out.println("Debe encender el vehículo antes de acelerar");
            }


            
            //FRENAR
            if((res.equals("C") || res.equals("Frenar")) && encendido == true && velocidad >= 200){              
                frenar();   
                System.out.println("Ha frenado.");
                
                
            }else if((res.equals("C") || res.equals("Frenar")) && encendido == false){
                System.out.println("Debe encender el vehículo antes de frenar");
            }
            
            
            
            //APAGAR
            if((res.equals("D") || res.equals("Apagar")) && encendido == true && velocidad <= 0){              
                encendido = false;   
                System.out.println("Se ha apagado el vehículo.");
                
                
            }else if((res.equals("D") || res.equals("Apagar")) && encendido == false){
                System.out.println("Ya está apagado el vehículo.");
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
        while(encendido && velocidad >= 0){
            System.out.println(velocidad + "km/h");
            velocidad--;
        }
    }        
}

