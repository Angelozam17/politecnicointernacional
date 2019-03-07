Proceso switch
	a<-0
	b<-0
	op<-0
	Escribir 'Digite el primer número.'
	Leer a
	Escribir 'Digite el segundo número.'
	Leer b
	Escribir 'Digite  1)Sumar  2)Restar  3)Multiplicar  4)Dividir'
	Leer op
	Segun op  Hacer
		1:
			Escribir a,' + ',b,' = ',a+b
		2:
			Escribir a,' - ',b,' = ',a-b
		3:
			Escribir a,' * ',b,' = ',a*b
		4:
			Escribir a,' / ',b,' = ',a/b
		De Otro Modo:
			Escribir 'Escribe un número válido.'
	FinSegun
FinProceso

