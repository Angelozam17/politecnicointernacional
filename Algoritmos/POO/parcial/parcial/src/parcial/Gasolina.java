package parcial;

import javax.swing.JOptionPane;

public class Gasolina {
	private int galon;
	
	
	public Gasolina() {
		while(true) {
			galon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el n�mero de galones"));
			double litro = (double) galon * 3.78541;
			JOptionPane.showInternalMessageDialog(null, "Conversi�n de galones a litros es " + litro);
		}
	}

}
