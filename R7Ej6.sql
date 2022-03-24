USE `ventapromoscompleta`;

drop procedure if exists ej6;

delimiter $$

create procedure ej6(ano int)
begin

select monthname(ventas.fecventa), sum(precioventa*cant)
 from detalleventa right join ventas
	on detalleventa.codventa = ventas.codventa 
 where year(fecventa) = ano
 group by monthname(fecventa)
 
 
 having sum(precioventa*cant) > (select  avg (precioventa*cant)
							 from detalleventa join ventas
							 on detalleventa.codventa = ventas.codventa 
							 where year(fecventa) = ano);
 
 end $$
 
 delimiter ;
 
 call ej6(2012);
 