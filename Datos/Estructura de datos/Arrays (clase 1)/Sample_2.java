package Arrays;

import javax.swing.JOptionPane;

public class Sample_2 {

	public static void main(String[] args) {
		double estatura[] = new double [4];
		double peso[] = new double [4];
		
		for(byte i = 0; i < 4; i++){
			estatura[i] = Double.parseDouble(JOptionPane.showInputDialog("Digita una estatura"));
			System.out.println("La estatura número " + (i+1) + " es " + estatura[i] + "cm");
			
			peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Digita un peso"));		
			System.out.println("El peso número " + (i+1) + " es " + peso[i] + "kg\n");
		}

	}

}
