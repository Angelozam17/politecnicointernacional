package Exercises_2;
import javax.swing.*;

public class Rectangulo {
	public double largo;
	public double ancho;
	
	//Constructor
	public Rectangulo() {
		largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Largo de la pared"));
		ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ancho de la pared"));
		CalArea();
		System.out.println("El área de la pared es de " + CalArea());
		System.out.println("Tiempo requerido para pintar la pared " + ((int)CalArea() * 10) + " minutos.");
	}
	
	public double CalArea() {
		double area = largo * ancho;
		return area;
	}
}
