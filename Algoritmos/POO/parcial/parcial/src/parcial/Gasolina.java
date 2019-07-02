package parcial;

import javax.swing.*;

public class Gasolina {
	private int galon;
	
	
	public Gasolina() {
		while(true) {
			galon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el numero de galones"));
			double litro = (double) galon * 3.78541;
			JOptionPane.showInternalMessageDialog(null, "Conversion de galones a litros es " + litro);
		}
	}

}
