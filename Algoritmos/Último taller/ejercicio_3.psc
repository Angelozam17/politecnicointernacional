Algoritmo zoologo
	x<- 1
	base <- 60000
	
	Repetir
		Escribir "Nombre vendedor"
		Leer vendedor 
		
		mientras x <= 3 
			Escribir "Venta #" x 
			Leer venta
			
			acum <- acum + venta
			x <- x + 1
		FinMientras
		
		
		Escribir vendedor
		Escribir "Total de ventas esta semana $" acum
		Escribir "Comisiones $" acum * 0.1
		Escribir "Sueldo total $" (acum * 0.1) + base
		
		Escribir " "
		
		x <- 1
		acum <- 0;
	Hasta Que vendedor = "NO" 
	
	
FinAlgoritmo
