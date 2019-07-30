package Arrays;
import javax.swing.*;

public class Sample_1 {

	public static void main(String[] args) {
		//byte edades[] = {1, 2, 3, 4, 5};
		
		double estatura [] = new double [3];	
		double contad = 0;
		byte i;
		
		for(i = 0; i < 3; i++){
			estatura[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita una estatura"));
			
			System.out.println((byte)estatura[i]);
			contad += estatura[i];
		}
		
		JOptionPane.showMessageDialog(null, "La suma de todo es " + (byte) contad + "\n" +
									        "El promedio de todo es " + (byte)contad/i);
		
		
	}

}
