create database Logean;

use Logean;

create table people(

	code int(3) zerofill auto_increment primary key,
	name varchar(30) not null,
	sales int(9) not null
);

desc people;

insert into people(name, sales) value("Juan Rodriguez", 4500);
insert into people(name, sales) value("Pedro Hernandez", 6000);
insert into people(name, sales) value("Andrea Gutierrez", 6200);
insert into people(name, sales) value("Yolanda Perez", 5800);
insert into people(name, sales) value("Victor Rodriguez", 7000);
insert into people(name, sales) value("Hernan Correa", 3800);
insert into people(name, sales) value("Andres Rodriguez", 5900);
insert into people(name, sales) value("Martha Sanchez", 12000);
insert into people(name, sales) value("Juan Gomez", 10000);
insert into people(name, sales) value("Andrea Almeciga", 13000);
insert into people(name, sales) value("Sonia Hernandez", 20000);
insert into people(name, sales) value("Andrez Velasquez", 35000);

select * from people;

select *, if(sales > 0 && sales <= 6000, sales + (sales * 0.05), "Intento 1") as "Aumento 5%" from people;

select *, if(sales > 6000 && sales <= 12000, sales + (sales * 0.1), "Intento 2") as "Aumento 10%" from people;

select *, if(sales > 12000 && sales <= 40000, sales + (sales * 0.15), "Intento 3") as "Aumento 15%" from people;







