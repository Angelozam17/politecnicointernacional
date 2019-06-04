package vehiculo;
import javax.swing.*;

public class Vehiculo {
    
    private String marca, modelo;
    private int velocidad;
    private boolean encendido;
    
    public Vehiculo(){
        this.marca = "Chevrolet";
        this.modelo = "2019";
        this.velocidad = 60;
        this.encendido = true;
    }
    
    public String getMarca() {
        return marca;
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

