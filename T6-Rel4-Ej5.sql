/***************************************Ejercicio 30 - FJMG (Fran)****************************/
/* Enunciado: Hallar la comisión, nombre y salario 
de los empleados con más de tres hijos, clasificados por comisión
 y dentro de comisión por orden alfabético. */

use `empresaclase1`;

drop procedure if exists ej5;

delimiter $$

create procedure ej5 (numhij tinyint (3))
begin

select comisem, concat(nomem, ' ', ape1em, ' ', ifnull(ape2em, '')), salarem
from empleados
where numhiem > numhij and comisem is not null
order by comisem, numem desc;

end $$

delimiter ;

call ej5(3);
/*********************************************************************************************/