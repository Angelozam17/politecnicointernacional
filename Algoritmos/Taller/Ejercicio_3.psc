Algoritmo Descuento
	
	valor_produc <- 0;
	desc <- 0.2;
	Escribir "Por compras mayores a $1.000 tienes un descuento del 20%.";
	Escribir "Escriba el valor de su producto.";
	Leer valor_produc;
	
	si valor_produc > 1000 entonces
		valor_produc <- valor_produc - (valor_produc*desc);
		Escribir "Tienes un descuento del 20%.";
	FinSi
	
	Escribir "Total a pagar: $" valor_produc;
	
FinAlgoritmo
