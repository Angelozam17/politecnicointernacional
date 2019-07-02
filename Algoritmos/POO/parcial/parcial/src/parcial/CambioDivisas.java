package parcial;

public class CambioDivisas {
	private double cop;
	private double tipoCambio;
	private double gananciaPesos, gananciaDolares;
	
	//CONSTRUCTOR
	public CambioDivisas(double cop) {
		this.cop = cop;
		gananciaPesos = (convertirADolaresD() - convertirADolaresU())*3210;
		gananciaPesos = Math.round(gananciaPesos*100)/100d;
		gananciaDolares = (convertirADolaresD() - convertirADolaresU());
		gananciaDolares = Math.round(gananciaDolares*100)/100d;
		System.out.println("Son $" + convertirADolaresD() + " dolares.");
		System.out.println("Ganancia pesos $" + gananciaPesos);
		System.out.println("Ganancia dolares $" + gananciaDolares);
	}
	
	//GETTERS
	public double getCOP() {
		return cop;
	}
	
	public double getTC() {
		return tipoCambio;
	}
	
	//SETTERS
	public void setCOP(double cop) {
		this.cop = cop;
	}
	
	public void setTC(double tc) {
		this.tipoCambio = tc;
	}
	
	//METHODS
	public double convertirADolaresD() {
		tipoCambio = 2800;
		return Math.round((getCOP()/tipoCambio)*100)/100d;
	}
	
	public double convertirADolaresU() {
		tipoCambio = 2900;
		return Math.round((getCOP()/tipoCambio)*100)/100d;
	}
}
