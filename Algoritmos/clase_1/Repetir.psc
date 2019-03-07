Proceso Información
	codigo<-0
	nombre<-''
	horas_mes<-0
	valor_hora<-6000
	rete<-0.19
	Escribir 'Escribe tu nombre y apellido.'
	Leer nombre
	Escribir 'Escribe tu código personal.'
	Leer codigo
	Repetir
		Escribir 'Código inválido'
		Leer codigo
	Hasta Que codigo=1024586470
	Escribir 'Código correcto.'
	Escribir 'Horas trabajadas este mes.'
	Leer horas_mes
	salario_bruto<-horas_mes*valor_hora
	salario_neto<-salario_bruto-(salario_bruto*rete)
	Escribir 'Nombre: ',nombre
	Escribir 'Salario bruto: $',salario_bruto
	Escribir 'Salario neto: $',salario_neto
FinProceso

