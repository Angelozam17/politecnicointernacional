package triangulo;

import javax.swing.JOptionPane;

public class Triangulo {
    
    private int a, b, c;
    private double area, altura;
    private String tipo;
    
    
    
    //Constructors
    public Triangulo(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        tipo = JOptionPane.showInputDialog(null, "Digita el tipo de triángulo");               
    }
      
    
    public Triangulo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    
    //Getters

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public String getTipo() {
        return tipo;
    }
    
    
    

    //Setters
    public void setA(int a) {
        this.a = a;
       
    }

    public void setB(int b) {
        this.b = b;
    }
        
    public void setC(int c) {
        this.c = c + 5;
    }

    public void calcArea() {
    }
    
    
    
    //Mostrar datos
    public void show(){

    }
    
    //Hipotenusa
    public int hipo(){
        return  2;
    }
       
}
