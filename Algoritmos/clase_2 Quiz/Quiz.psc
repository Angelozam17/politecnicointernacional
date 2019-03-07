Proceso costo_agua
	costo_ini<-60000
	litros_con<-0
	costo_litro<-0
	
	Escribir 'Escriba el número de litros de agua consumidos este mes.'
	Leer litros_con
	
	Si litros_con<=50 Entonces
		Escribir 'Debes pagar: $',costo_ini
	Sino
		
		Si litros_con>50 Y litros_con<=200 Entonces
			total_1<-(litros_con-50)*30
			Escribir 'Este mes debes pagar: $',total_1+costo_ini
		Sino
			
			Si litros_con>200 Y litros_con<=300 Entonces
				total_1<-4500
				total_2<-(litros_con-200)*50
				Escribir 'Este mes debes pagar: $',total_2+total_1+costo_ini
			Sino
				
				Si litros_con>300 Entonces
					total_1<-4500
					total_2<-5000
					total_3<-(((litros_con-300)*50)*0.25)+(litros_con-300)*50
					Escribir 'Demasiado gasto. Por favor disminuya el consumo y aporte a la conservación del medio ambiente.'
					Escribir 'Este mes debes pagar: $',total_3+total_2+total_1+costo_ini
				FinSi
				
			FinSi
			
		FinSi
		
	FinSi
FinProceso

