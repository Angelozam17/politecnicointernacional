package Exercises;

public class Exercise_1 {
	
	public static void main(String[] args) {
		
		Circunferencia rueda = new Circunferencia(10.2);	
		System.out.println("El �rea de la rueda es " + rueda.CalArea() +
						 "\nEl per�metro de la rueda es " + rueda.CalPerim());
		
		Circunferencia moneda = new Circunferencia(1.4);	
		System.out.println("El �rea de la moneda es " + moneda.CalArea() +
				         "\nEl per�metro de la moneda es " + moneda.CalPerim());
		
		Circunferencia otro = new Circunferencia();
	}

}
