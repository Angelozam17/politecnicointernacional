create database poliinter;

use poliinter;
/* CREACIÓN DE TABLA */
create table estudiantes(

	code int(3) zerofill auto_increment primary key,
	document varchar(10) not null,
	course varchar(50) not null,
	date date not null,
	payment int(8) not null

);

select * from estudiantes;

drop table if exists estudiantes;

/* INSERTAR DATOS */

insert into estudiantes(document, course, date, payment) value(22333445, 'PHP básico', '2006-08-10', 500000);

insert into estudiantes(document, course, date, payment) value(23333444, 'PHP básico', '2006-08-10', 500000);

insert into estudiantes(document, course, date, payment) value(24333443, 'PHP básico', '2006-08-11', 500000);

insert into estudiantes(document, course, date, payment) value(25333449, 'PHP experto', '2006-08-11', 1000000);

insert into estudiantes(document, course, date, payment) value(26333447, 'PHP experto', '2006-08-12', 1000000);

insert into estudiantes(document, course, date, payment) value(22333443, 'JavaScript básico', '20060810', 200000);

insert into estudiantes(document, course, date, payment) value(23333444, 'Operador de PC', '20060812', 100000);

insert into estudiantes(document, course, date, payment) value(28333448, 'Operador de PC', '20060813', 100000);

insert into estudiantes(document, course, date, payment) value(29333444, 'Operador de PC', '20060814', 100000);

insert into estudiantes(document, course, date, payment) value(30333444, 'Operador de PC', '20060814', 100000);

insert into estudiantes(document, course, date, payment) value(29333454, 'Diseño Web', '20060814', 800000);

insert into estudiantes(document, course, date, payment) value(30331444, 'Diseño Web', '20060814', 800000);



/*TALLE #2 */

select count(course) as 'Número de diseño web' from estudiantes where course = 'Diseño Web';

select sum(payment) as 'Suma pagos 2006/08/14' from estudiantes where date = '2006-08-14';

select avg(payment) as 'Promedio de pagos' from estudiantes;

select max(payment) as 'Pago más alto', min(payment) as 'Pago más bajo' from estudiantes; 

select count(course) as 'Número de cursos inscritos', sum(payment) as 'Pagó total' from estudiantes where document = 23333444;
