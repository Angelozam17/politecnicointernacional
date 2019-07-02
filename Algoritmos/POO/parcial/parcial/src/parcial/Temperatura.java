package parcial;
import javax.swing.*;
public class Temperatura {
    private double gradosCentigrados;
	private double gradosFarenheit;
    
    //CONSTRUCTOR
    public Temperatura(double gc){
        this.gradosCentigrados = gc;
        CalcGrados();
        System.out.println("Conversión de celsius a Fahrenheit " + gradosFarenheit);
    }
    
    public Temperatura() {
    	gradosCentigrados = Double.parseDouble(JOptionPane.showInputDialog("Convertidor de grados centigrados a farenheit"));
    	CalcGrados();
    	System.out.println("Conversión de celsius a Fahrenheit " + gradosFarenheit);
    }
    
    
    //GETTERS
    public double getGC() {
    	return gradosCentigrados;
    }
    
    //SETTERS
    public void setGC(double gc) {
    	this.gradosCentigrados = gc;
    }
    
    //METHODS
    public double CalcGrados() {
    	gradosFarenheit = ((1.8)*gradosCentigrados)+32; 
    	return gradosFarenheit;
    }
    
}
