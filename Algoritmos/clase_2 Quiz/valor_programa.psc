Proceso ejercicio_PROGRAMA
	valor_prog<-0
	tipo_pago<-''
	Escribir 'Escriba el valor del programa.'
	Leer valor_prog
	Escribir 'Tipo de pago: '
	Escribir 'Efectivo - Cr�dito - Cesant�as'
	Leer tipo_pago
	Segun tipo_pago  Hacer
		'Efectivo':
			total<-valor_prog-(valor_prog*0.02)
			Escribir 'El pago en efectivo tiene un descuento del 2%.'
			Escribir 'Total a pagar: $',total
		'Cr�dito':
			Repetir
				Escribir '�A cu�ntos meses?'
				Leer meses
			Hasta Que meses<=6
			total_mes<-valor_prog/meses
			total<-(total_mes+(total_mes*0.05))
			Escribir 'El pago a cr�dito tiene un incremento del 5% por cada mes.'
			Escribir 'Total a pagar por mes: $',total
		'Cesant�as':
			total<-valor_prog-(valor_prog*0.01)
			Escribir 'El pago en cesant�as tiene un descuento del 1%.'
			Escribir 'Total a pagar: $',total
	FinSegun
FinProceso

