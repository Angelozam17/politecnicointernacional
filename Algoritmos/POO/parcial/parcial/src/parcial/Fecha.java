package parcial;

import javax.swing.JOptionPane;

public class Fecha {
	
	private int dia, mes, year;
	String nYear = null;
	
	//Construtors
	public Fecha() {
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el día"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
		year = Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));
		
		
		
		switch(mes) {
			case 1:  nYear = "enero";      break;
			case 2:  nYear = "febrero";    break;
			case 3:  nYear = "marzo";      break;
			case 4:  nYear = "abril";      break;
			case 5:  nYear = "mayo";       break;
			case 6:  nYear = "junio";      break;
			case 7:  nYear = "julio";      break;
			case 8:  nYear = "agosto";     break;
			case 9:  nYear = "septiembre"; break;
			case 10: nYear = "octubre";    break;
			case 11: nYear = "noviembre";  break;
			case 12: nYear = "diciembre";  break;
			default: System.out.println("Digita un mes válido.");
		
		}
		
		if(dia <= 31 && mes <= 12 && year > 1900) {
			System.out.println(dia + " " + nYear + " " + year);
		}
		
		
		
	}
	
	public Fecha(int d, int m, int y) {
		this.dia = d;
		this.mes = m;
		this.year = y;
		System.out.println(dia + " " + nYear + " " + year);
	}
	
	
	//GETTERS
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getYear() {
		return year;
	}
	
	
	//SETTERS
	
}
