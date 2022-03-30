use `empresaclase1`;

create view fiestareyes
as

select 'Día 1' as 'Día Fiesta', concat_ws(' ', empleados.ape1em, empleados.ape2em) as Apellidos,
	empleados.nomem as 'Nombre',
    empleados.numhiem+2 as 'Número de Invitaciones',
    empleados.numhiem as 'Número de regalos'
    from empleados
		where ifnull(empleados.numhiem, 0) > 0
			and substring(empleados.ape1em, 1, 1) >='M';
            
select *
from fiestareyes
order by Apellidos;