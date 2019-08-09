create database Angelo; 

use Angelo;

create table empleados(

	name varchar(40) not null,
	document varchar(10) primary key,
	gender char(1) not null,
	address varchar(50) not null,
	salary int(2) not null,
	dependent_children tinyint(2)
	
);

select * from empleados;

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Nicolás Arrieta', 102325645, 'M', 'Cr 56 # 21', 3000000, 3);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Paula Repete', 1024561235, 'F', 'Cr 58 # 121', 1000000, 0);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Angelo Zambrano', 1024586410, 'M', 'Cr 115 # 11', 15000000, 2);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Steven Carmelo', 105236521, 'M', 'Cr 15 # 1', 150000, 5);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Jhudel Villafañe', 1023621521, 'M', 'Cr 19 # 10', 6300000, 7);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Daniel Lomas', 126654213, 'M', 'Cr 1 # 100', 9400000, 2);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Daniela Havez', 1025652321, 'F', 'Cr 120 # 100', 6000000, 1);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Nicol Herrera', 105236212, 'F', 'Cr 20 # 101', 9000000, 5);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Stephany Xu', 169545632, 'F', 'Cr 25 # 12', 5000000, 2);

insert empleados(name, document, gender, address, salary, dependent_children) 
	value('Rotuna Kimazuu', 1025621232, 'M', 'Cr 15 # 52', 8000000, 2);


select name, salary, salary + (salary * 0.1) as aumento from empleados;

select name, salary, dependent_children, dependent_children * 20000, salary + (dependent_children * 20000) from empleados;
