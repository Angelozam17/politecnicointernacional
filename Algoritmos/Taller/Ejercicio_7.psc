Algoritmo clave
	
	password<-0;
	art<-"";
	precio<-0;
	
	
	Escribir "Escribe tu contraseña."
	Leer password
	
	si password = 01 entonces
		desc<-0.1
		Escribir "Tienes un descuento del 10%"
	SiNo
		si password = 02 entonces
			desc<-0.2
			Escribir "Tienes un descuento del 20%"
			
		sino 
			desc<- 0;
		FinSi
	FinSi
	
	
	
	Escribir "Nombre del articulo"
	Leer art
	
	Escribir "Precio del producto."
	Leer precio
	
	
	
	
	precio_desc<-precio - (precio * desc);
	Escribir "Nombre del producto: " art
	Escribir "Precio del producto: $" precio
	Escribir "Precio con descuento: $" precio_desc
	
FinAlgoritmo
