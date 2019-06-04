package vehiculo_2;
import javax.swing.*;

public class Vehiculo {
    
    private String marca, modelo;
    private int velocidad;
    private boolean encendido;
    
    public Vehiculo(){
        String res = JOptionPane.showInputDialog("¿Deseas encender el vehiculo?");
        System.out.println(res);
        
        if("si".equals(res)) {
            encendido = true;   
            System.out.println("Se ha encendido el vehiculo...");
            acelerar();
        }
        else
            System.out.println("No se ha encendido el vehiculo.");           
    }
    
    public void acelerar(){
        while(encendido && velocidad <= 200){
            System.out.println(velocidad + "km/h");
            velocidad++;
            frenar();
        }
    }
    
    public void frenar(){
        while(encendido && velocidad == 200){
            System.out.println(velocidad + "km/h");
            velocidad--;
        }
    }
    
    public void setCaptura(String Ma, String Mo, int Ve, boolean encendido){
        this.marca = Ma;
        this.modelo = Mo;
        this.velocidad = Ve;
        this.encendido = encendido;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "La marca es " + marca + ".\n" +
                                    "El modelo es " + modelo + ".\n" +
                                    "La velocidad es " + velocidad + ".\n" +
                                    "Su estado es " + encendido + ".\n"
        );
    }
}