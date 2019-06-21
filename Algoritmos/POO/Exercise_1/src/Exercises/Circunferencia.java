package Exercises;
import javax.swing.*;

public class Circunferencia {
	private double radio;
	
	//Constructors
	public Circunferencia(){
		while(true) {
			String option = JOptionPane.showInputDialog(null, "�Qu� deseas hacer?\n" +
					  "A. Modificar radio.\n" +
					  "B. Consultar valor del radio.\n" + 
					  "C. Calcular �rea.\n" + 
					  "D. Calcular per�metro.");
			
			if("A".equals(option)) {
				ModRadio();
			}else if("B".equals(option)) {
				System.out.println(radio);
			}else if("C".equals(option)) {
				CalArea();
				System.out.println("El �rea es " + CalArea());
			}else if("D".equals(option)) {
				CalPerim();
				System.out.println("El per�metro es " + CalPerim());
			}
		}
		
	}
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	
	//Getters
	public double getRadio() {
		return radio;
	}
	
	
	
	//Methods
	public double CalArea() {
		double area = 3.1415*(radio*radio);	
		return area;
	}
	
	public double CalPerim() {
		double perim = 2*3.1415*radio;	
		return perim;
	}
	
	public void ModRadio() {
		radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita el radio de la circunferencia."));
	}
		
}
