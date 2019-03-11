Algoritmo Salario
	
	horas_trabajadas <- 0;
	pago_hora <- 0;
	
	Escribir "Escribe las horas trabajadas."
	Leer horas_trabajadas;
	
	si horas_trabajadas <= 40 entonces
		pago_hora <- 16;
		total <- horas_trabajadas * pago_hora;
		Escribir "Tu salario es de $" total;
		
	sino 
		pago_hora <- 20;
		horas_40 <- 640;
		total <- (horas_trabajadas - 40) * 20;
		Escribir "Tu salario es de $" total + horas_40;
		
	FinSi
	
FinAlgoritmo
