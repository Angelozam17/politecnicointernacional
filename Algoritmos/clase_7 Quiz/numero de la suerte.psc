Proceso bucles
	num_suerte <- 9;
	
	Escribir "Adivina el n�mero de la suerte de 1 a 10."
	
	mientras num != 9
		Leer num
		
		si num_suerte = num entonces
			Escribir "Haz encontrado el n�mero de la suerte."
			
		sino 
			Escribir "Sigue intentando."
		FinSi
		
		intentos <- intentos + 1;
	FinMientras
	
	Escribir "Adivinaste en " intentos " intentos."
FinProceso

