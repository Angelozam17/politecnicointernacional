Proceso DoWhile
	
	n <- 0;
	Escribir "Escribe las notas.";
	
	repetir 
		
		n <- n + 1;
		
		leer notas;
		contador <- contador + notas;
		
		si notas >= 60 entonces 
			notas_a <- notas_a + 1;
		sino 
			notas_r <- notas_r + 1;
		FinSi
		
		
	Hasta Que n == 5;
	
	Escribir "Tu promedio total es de " contador/n "%";
	eSCRIBIR "Aprobaste " notas_a " asignaturas.";
	eSCRIBIR "Reprobaste " notas_r " asignaturas.";
	
FinProceso
