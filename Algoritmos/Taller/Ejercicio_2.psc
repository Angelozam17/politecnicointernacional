Algoritmo Promedio
	a1<-0;
	a2<-0;
	a3<-0;
	
	Escribir "Escribe la nota de las tres asignaturas.";
	Leer a1, a2, a3;
	
	si a1 > 100 | a2 > 100 | a3 > 100 entonces
		Escribir "Digite un número válido"
		
		Repetir
			Escribir "Escribe la nota de las tres asignaturas.";
			Leer a1, a2, a3;
		Hasta Que a1 <= 100 & a1 <= 100 & a1 <= 100;
	FinSi
	
	
	prom<- (a1 + a2 + a3)/3;
	
	si prom < 70 Entonces
		Escribir "Has reprobado el curso.";
		Escribir "Tu promedio es de " prom "%.";
		
	sino 
		Escribir "Has aprobado el curso.";
		Escribir "Tu promedio es de " prom "%.";
	FinSi
FinAlgoritmo
