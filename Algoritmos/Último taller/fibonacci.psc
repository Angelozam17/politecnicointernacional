Proceso fibonacci
	
	Escribir "Qué secuencia de Fibonacci quieres ver."
	Leer n
	
	a <- 0
	b <- 1
	c <- a + b
	
	para x <- 1 hasta n Hacer
		
		Escribir a
		
		
		a <- b
		b <- c
		c <- a + b
		
	FinPara
	
FinProceso
