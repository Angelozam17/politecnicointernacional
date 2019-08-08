drop table if exists estudiantes;

create database datos_alumnos;

/* SELECCIONAR LA BASE DE DATOS QUE SE VA A USAR */
use datos_alumnos;


/* CREAR UNA TABLA */
create table estudiantes(

	cedula int(20) not null primary key,
	nombre varchar(50) not null,
	correo varchar(60),
	telefono varchar(14)

);


/* SELECCIONAR TODOS LOS REGISTROS DE UNA TABLA */
select * from estudiantes;

select telefono, cedula from estudiantes where nombre = 'Jhonnatan Steven Guerrero Rocha';

select nombre from estudiantes where cedula = 1030613028;

select * from estudiantes where correo = 'andresfelipetorrescurrea@gmail';


/* DESCRIBE */
describe estudiantes;

/* INSERTA DATOS A LA TABLA */
insert into estudiantes(cedula, nombre, correo, telefono)
values(101428262, 'Andrés Jiménez Ramírez', 'andresfelipetorrescurrea@gmail.com', '3202028799'); 

insert into estudiantes(cedula, nombre, correo, telefono)
values(1071170458, 'Jhonnatan Steven Guerrero Rocha', 'jhonnatangue99@hotmail.com', '3123432344'); 

insert into estudiantes(cedula, nombre, correo, telefono)
values(1094241303, 'Vanessa Guisselle Pastrana Rangel', 'vanparan@gmail.com', '3008836558'); 

insert into estudiantes(cedula, nombre, correo, telefono)
values(1015472942, 'Andres Felipe Garcia Ducuara', 'andressducu.14@hotmail.com', '3194111008'); 

insert into estudiantes(cedula, nombre, correo, telefono)
values(1070017042, 'Carlos Duvan Gonzalez Ardila', 'ardiladuvan7@gmail.com', '3108889050'); 

insert into estudiantes(cedula, nombre, correo, telefono)
values(1030613028, 'Jeniffer Gonzaliaz Moreno', 'jeinlo_afri@hotmail.com', '3213800862'); 

insert into estudiantes(cedula, nombre, correo, telefono)
values(1019087513, 'Andres Felipe Torres Currea', 'andresfelipetorrescurrea@gmail.com', '3008475552'); 

/* Eliminar */
delete from estudiantes where nombre = 'Andres Felipe Garcia Ducuara';
delete from estudiantes where telefono = 3213800862;

update estudiantes set nombre = 'Andrés Felipe Jiménez Ramírez' where nombre = 'Andrés Jiménez Ramírez';
update estudiantes set cedula = 1014282625 where cedula = 101428262;