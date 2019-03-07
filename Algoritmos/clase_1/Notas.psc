Proceso Notas
	mat_1<-0
	mat_2<-0
	mat_3<-0
	Escribir 'Escriba las notas de sus materias.'
	Leer mat_1,mat_2,mat_3
	
	nota<-(mat_1+mat_2+mat_3)/3
	promedio<-(nota*100)/5
	Si promedio>=60 Entonces
		Escribir 'Has aprobado";
		Escribir "Tu nota final es ",nota;
		Escribir 'Con promedio del ',promedio, '%'
	Sino
		Escribir 'Has reprobado";
		Escribir "Tu nota final es ",nota;
		Escribir 'Con promedio del ',promedio, '%'
	FinSi
	
FinProceso

