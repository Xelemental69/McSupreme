use `empresaclase1`;

drop procedure giveMeEverything;
drop procedure exentosDeComisiones;
drop procedure giveMePhone;
drop procedure trabajadoresPadres;
drop procedure direccionCentro;
drop procedure presupSup;
drop procedure presupIgSup;
drop procedure fromDatetoNow;
drop procedure betweenDates;
drop procedure outOfDates;

delimiter $$

create procedure giveMeEverything 
()
begin
	select * from empleados; -- Ejercicio 1 --
end $$

create procedure exentosDeComisiones 
()
begin
	select concat(nomem, ' ', ape1em, ' ', ifnull(ape2em, ' ')) as 'Nombre Completo'
	from empleados
	where comisem is null; -- Ejercicio 5 --
    
end $$
    
create procedure giveMePhone 
(in nombre varchar (20), in ap1 varchar (20))
begin
    
    select extelem from empleados where nomem = nombre and ape1em = ap1; -- Ejercicio 2 --
    
end $$
 
create procedure trabajadoresPadres
 (in min tinyint(3), in max tinyint (3))
 begin
	select concat_ws(' ',nomem, ape1em, ape2em) as 'Nombre Completo'
	from empleados
	where numhiem > min and numhiem < max;
 end $$
 
create procedure direccionCentro
(in centro varchar(60))
begin

	select dirce
	from centros
	where nomce = centro; -- Ejercicio 6 --

end $$

create procedure presupSup
(in presu decimal(10,2))
begin

	select nomde
	from departamentos
	where presude > presu; -- Ejercicio 7 --

end $$

create procedure presupIgSup
(in presu decimal(10,2))
begin

	select nomde
	from departamentos
	where presude >= presu; -- Ejercicio 8 --

end $$

create procedure fromDatetoNow
(in anos int)
begin

	select concat_ws(' ',nomem, ape1em, ape2em) as 'Nombre Completo'
	from empleados
	where fecinem < subdate(curdate(), interval anos year); -- Ejercicio 9 --

end $$

create procedure betweenDates
(in anos1 int, anos2 int)
begin

	select concat_ws(' ',nomem, ape1em, ape2em) as 'Nombre Completo'
	from empleados
	where fecinem between subdate(curdate(), interval anos2 year) and subdate(curdate(), interval anos1 year); -- Ejercicio 10 --

end $$

create procedure outOfDates
(in anos1 int, anos2 int)
begin

	select concat_ws(' ',nomem, ape1em, ape2em) as 'Nombre Completo'
	from empleados
	where !(fecinem between subdate(curdate(), interval anos2 year) and subdate(curdate(), interval anos1 year)); -- Ejercicio 10 --

end $$
 
 delimiter ;
 
 call giveMeEverything;

 call giveMePhone('Juan', 'Lopez');

 call trabajadoresPadres(1, 3);
/* select nomem, ape1em, ape2em
 from empleados
 where numhiem > 1; -- Ejercicio 3 --

select concat_ws(' ',nomem, ape1em, ape2em) as 'Nombre Completo'
 from empleados
 where numhiem > 1 and numhiem < 3; -- Ejercicio 4 -- */

call exentosDeComisiones;

call direccionCentro(' SEDE CENTRAL');

call presupSup (6000);

call presupIgSup (6000);

call fromDatetoNow (1);

call betweenDates(1, 3);

call outOfDates(1, 3);