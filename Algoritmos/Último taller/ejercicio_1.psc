Algoritmo altetas
	
	x <- 1
	
	mientras atleta != "NO" Hacer
		Escribir "Nombre del atleta."
		Leer atleta
		
		si atleta != "NO" entonces
			
			mientras x <= 3 hacer
				Escribir "Distancia " x
				Leer distan
				
				acum <- acum + distan
				
				x <- x + 1
			FinMientras
			Escribir "El promedio de " atleta " en esta competencia es " acum / x
			Escribir " "
			x <- 1
			
		FinSi
		
		num_atletas <- num_atletas + 1;
	FinMientras
	
	Escribir "El número de atletas es " num_atletas-1	
	
FinAlgoritmo
