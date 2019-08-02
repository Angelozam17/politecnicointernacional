create database compugreif;
drop table if exists articulos;

use compugreif;
create table articulos(
	
	codigo int(5) zerofill auto_increment primary key,
	nombre varchar(30) not null,
	descripcion varchar(90),
	precio float(10) not null,
	cantidad tinyint (99) not null
);

select * from articulos;
select * from articulos where nombre = 'impresora';
select * from articulos where precio >= 500;
select * from articulos where cantidad < 30;
select nombre, descripcion from articulos where precio != 100;

insert into articulos (nombre, descripcion, precio, cantidad)
value('impresora', 'Epson Stylus C45', 400.8, 10);

insert into articulos (nombre, descripcion, precio, cantidad)
value('impresora', 'Epson Stylus C85', 500, 30);

insert into articulos (nombre, descripcion, precio, cantidad)
value('monitor', 'Samsung 14', 800, 10);

insert into articulos (nombre, descripcion, precio, cantidad)
value('teclado', 'ingles Biswal', 100, 50);

insert into articulos (nombre, descripcion, precio, cantidad)
value('teclado', 'español Biswal', 90, 50);