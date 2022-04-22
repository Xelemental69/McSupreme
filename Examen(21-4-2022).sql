USE `GBDturRural2015`;

-- EJERCICIO 1: 

drop procedure if exists ej1;

delimiter $$

create procedure ej1 ( zonaselect int (11), caracterselect int(11))
	begin

		select caracteristicasdecasas.*
		from casas join caracteristicasdecasas 
		on casas.codcasa = caracteristicasdecasas.codcasa
		where codzona = zonaselect 
		and codcaracter = caracterselect
		order by preciobase;

	end $$

delimiter ;

call ej1(1,1);


-- EJERCICIO 2:

drop procedure if exists ej2;

delimiter $$

create procedure ej2 ()
	begin

		select nomcasa, ifnull(nomcaracter, 'Sin características') as Caracteristicas
		from casas cross join caracteristicas;

	end $$

delimiter ;

call ej2();


-- EJERCICIO 3:

drop procedure if exists ej3;

delimiter $$

create procedure ej3 ( tiposelect int (11)	)
	begin

		select zonas.nomzona as ZONA, casas.nomcasa as CASA,
        concat('de ', casas.minpersonas, ' a ', casas.maxpersonas, ' personas') as 'ALOJAMIENTO PARA'
		from casas join zonas 
		on casas.codzona = zonas.numzona
		where codtipocasa = tiposelect
        order by numzona desc;

	end $$

delimiter ;

call ej3(1);


-- EJERCICIO 4:

drop procedure if exists ej4;

delimiter $$

create procedure ej4 ()
	begin

		select zonas.nomzona as ZONA, avg(casas.m2) as 'Media m2'
		from casas join zonas 
		on casas.codzona = zonas.numzona
        group by nomzona;

	end $$

delimiter ;

call ej4();


-- EJERCICIO 5:

drop procedure if exists ej5;

delimiter $$

create procedure ej5 ( casaselect int (11)	)
	begin

		select casas.codcasa, casas.nomcasa as Casa,
        count(reservas.codreserva) as 'Nº reservas'
		from casas join reservas 
		on casas.codcasa = reservas.codcasa
		where casas.codcasa = casaselect
        group by reservas.codcasa;

	end $$

delimiter ;

call ej5(1);


-- EJERCICIO 6:

drop procedure if exists ej6;

delimiter $$

create procedure ej6 ( casaselect int (11)	)
	begin

		select casas.codcasa, casas.nomcasa as Casa,
        count(reservas.codreserva) as 'Nº reservas',
        sum(numdiasestancia) as 'Dias reservados'
		from casas join reservas 
		on casas.codcasa = reservas.codcasa
		where casas.codcasa = casaselect
        group by reservas.codcasa;

	end $$

delimiter ;

call ej6(1);


-- EJERCICIO 8:

drop procedure if exists ej8;

delimiter $$

create procedure ej8(fecini date, fecfin date, zonaselect int(11))
	begin
    
		select casas.codcasa, casas.nomcasa
		from casas join reservas
		on casas.codcasa = reservas.codreserva
		where codzona = zonaselect
        and feciniestancia = fecini
		and date_add(feciniestancia, interval numdiasestancia day) <= fecfin;
    
    end $$
    
delimiter ;

call ej8('2013-3-15', '2013-3-15', 1);