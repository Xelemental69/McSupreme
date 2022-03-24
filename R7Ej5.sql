USE `ventapromoscompleta`;

drop procedure if exists ej5;

delimiter $$
create procedure ej5(ano int)
begin

select monthname(ventas.fecventa), sum(precioventa*cant)
 from detalleventa right join ventas
	on detalleventa.codventa = ventas.codventa 
 where year(fecventa) = ano
 group by monthname(fecventa);
 
 end $$
 
 delimiter ;
 
 call ej5(2012);
 