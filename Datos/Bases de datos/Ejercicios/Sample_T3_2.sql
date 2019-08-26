create table autocar(

	code int(2) zerofill primary key auto_increment,
	client varchar(30) not null,
	model char(1) not null,
	days int(2) not null

);

desc autocar;
select * from autocar;

insert into autocar(client, model, days)
	value("M. Suarez", "D", 6);

insert into autocar(client, model, days)
	value("R. Garcia", "G", 31);

insert into autocar(client, model, days)
	value("P. Lopez", "D", 14);

insert into autocar(client, model, days)
	value("M. Solis", "D", 18);

insert into autocar(client, model, days)
	value("F. Dominguez", "G", 22);

insert into autocar(client, model, days)
	value("L. Aznar", "D", 26);

insert into autocar(client, model, days)
	value("G. Yepes", "G", 13);

insert into autocar(client, model, days)
	value("A. Palma", "G", 34);


select *, if(model = "D", 30000 * days, 35000 * days) as total from autocar;

select *, if(days > 15, 200000, 0) as Descuento from autocar;