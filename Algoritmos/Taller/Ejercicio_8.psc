Algoritmo camisas
	
	total_camisas<-0;
	precio_camisas<-10000;
	
	Escribir "Precio por unidad de la camisa";
	Leer precio_camisas;
	
	Escribir "Número de camisas";
	Leer total_camisas;
	precio_total<- total_camisas * precio_camisas;
	
	si total_camisas >= 3 Entonces
		desc<-0.2;
		Escribir "Tienes un descuento del 20%";
		Escribir "Total a pagar: $" precio_total - (precio_total * desc) 
		
	sino 
		si total_camisas < 3 & total_camisas > 0 entonces 
			desc<-0.1;
			Escribir "Tienes un descuento del 10%";
			Escribir "Total a pagar: $" precio_total - (precio_total * desc) 
		FinSi
	FinSi
	
FinAlgoritmo
