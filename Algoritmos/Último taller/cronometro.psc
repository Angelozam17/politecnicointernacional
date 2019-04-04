Proceso cronometro
	
	repetir 
		
		para x <- 1 hasta 60 hacer
			
			seg <- x 
			
			//escribir seg
			
			si x = 60 entonces
				
				min <- min + 1
				seg <- 0
				
			FinSi
			
			si min = 60 Entonces
				
				hora <- hora + 1
				min <- 0
				
			FinSi
			
		Escribir hora ":" min ":" seg 
		FinPara
		
		
	Hasta Que hora = 2
	
FinProceso
