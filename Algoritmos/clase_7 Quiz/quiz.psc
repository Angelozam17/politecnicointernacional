Proceso alamcen
	cant_camisas<-0;
	precio_camisas<-0;
	
	Escribir 'Escribe el precio de la camisa.';
	Leer precio_camisas;
	
	Escribir 'Escribe la cantidad de camisas que deseas comprar.';
	Leer cant_camisas;
	
	total<-precio_camisas*cant_camisas;
	
	Si cant_camisas>=5 Y cant_camisas<10 Entonces
		
		desc<-0.1;
		Escribir 'Tuviste un descuento del 10% por comprar al menos 5 camisas.';
		Escribir 'Total a pagar: $',total-(total*desc);
		
	Sino
		
		Si cant_camisas>=10 Entonces
			
			desc<-0.2;
			Escribir 'Tuviste un descuento del 20% por comprar más de 10 camisas.';
			Escribir 'Total a pagar: $',total-(total*desc);
			
		Sino
			
			Si cant_camisas<5 Entonces
				
				Escribir 'No accediste a ningún descuento.';
				Escribir 'Total a pagar: $',total;
				
			FinSi
		FinSi
	FinSi
FinProceso

