Proceso Informaci�n
	codigo<-0
	nombre<-''
	horas_mes<-0
	valor_hora<-6000
	rete<-0.19
	Escribir 'Escribe tu nombre y apellido.'
	Leer nombre
	Escribir 'Escribe tu c�digo personal.'
	Leer codigo
	Repetir
		Escribir 'C�digo inv�lido'
		Leer codigo
	Hasta Que codigo=1024586470
	Escribir 'C�digo correcto.'
	Escribir 'Horas trabajadas este mes.'
	Leer horas_mes
	salario_bruto<-horas_mes*valor_hora
	salario_neto<-salario_bruto-(salario_bruto*rete)
	Escribir 'Nombre: ',nombre
	Escribir 'Salario bruto: $',salario_bruto
	Escribir 'Salario neto: $',salario_neto
FinProceso

