Algoritmo altetas
	
	x <- 1
	
	Escribir "Nombre del atleta."
	leer atleta
	
	mientras atleta != "NO" Hacer
		
							
		mientras x <= 3 hacer
			Escribir "Distancia " x
			Leer distan
			
			acum <- acum + distan
			
			x <- x + 1
			distan <- 0;
		FinMientras
		Escribir "El promedio de " atleta " en esta competencia es " acum / x
		Escribir " "
		x <- 1
				
		Escribir "Nombre del atleta."
		leer atleta
		
	FinMientras
	num_atletas <- num_atletas + 1;
	
	Escribir "El número de atletas es " num_atletas	
	
FinAlgoritmo
