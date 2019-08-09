use Angelo;

create table medicines(

	code int auto_increment primary key,
	name varchar(20),
	laboratory varchar(20),
	price decimal(5,3) unsigned,
	amount int unsigned

);

insert into medicines (name, laboratory, price, amount)
  values('Sertal','Roche',5.2,100);

insert into medicines (name, laboratory, price, amount)
  values('Buscapina','Roche',4.10,200);

insert into medicines (name, laboratory, price, amount)
  values('Amoxidal 500','Bayer',15.60,100);

insert into medicines (name, laboratory, price, amount)
  values('Paracetamol 500','Bago',1.90,200);

insert into medicines (name, laboratory, price, amount)
  values('Bayaspirina','Bayer',2.10,150); 

insert into medicines (name, laboratory, price, amount)
  values('Amoxidal jarabe','Bayer',5.10,250);


select * from medicines;

select code, name from medicines where laboratory = 'Roche' and price < 5;