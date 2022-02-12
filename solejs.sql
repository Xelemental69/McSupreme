/*******************************************************************/
/*          EJERCICIOS RESUELTOS UNIDAD 5                          */
/* NOTA ==> DADO QUE NO CONOCEMOS MUCHAS DE LAS SENTENCIAS SQL     */
/*          ESTOS EJERCICIOS NO ESTÁ RESUELTOS DE LA MEJOR FORMA   */
/*          POSIBLE, CUANDO AVANCEMOS EN EL TEMARIO, SE RESOLVERÁN */
/*          DE MANERA MÁS LÓGICA, CONVENIENTE Y EFICIENTE          */
/*******************************************************************/
use empresaclase2021;
/**** EJERCICIO 3 */
start transaction;
	select * from departamentos; -- ==> Comprobamos que el último departamento es el 130 y que el depto dirección comercial es el 110
	select * from centros; -- ==> Comprobamos que el centro "Relaciones con clientes" es el centro número 20 

	Insert into departamentos
	(numde, numce, presude, depende, nomde)
	values
	(132, 20,15000, 110, 'Publicidad');
	select * from empleados; -- ==> Comprobamos que el último empleado es el 563
	insert into empleados
	(numem, numde, extelem, fecnaem, fecinem, salarem, comisem, numhiem, nomem, ape1em, ape2em, dniem, userem, passem)
	values
	(565,132,'930','1967-6-12',curdate(),2000,150,2,'Rosa','del Campo', 'Florido',default,null,null);
	-- he usado la función curdate() que devuelve la fecha actual
	-- he usado default para que cargue en dni el valor por defecto definido
	-- usuario y contraseña null ==> no lo sabemos de momento
	insert into dirigir
	(numdepto, numempdirec,fecinidir,fecfindir,tipodir)
	values
	(132,565,curdate(), date_add(curdate(), interval 1 year), 'P');
commit;
-- de momento la fecha de inicio y fin de dirección podríais haberla puesto con fechas directamente
/* EJERCICIO 4 */
/* El departamento “Sector industrial” se ha trasladado al centro “Sede central”.*/

select * from centros; -- ==> buscamos el centro "Sede central"

update departamentos
set numce = 10
where nomde = 'Sector industrial';
/* EJERCICIO 5 */
/* Hemos contratado a dos nuevos empleados que van a formar parte del nuevo departamento
“Publicidad”. Sus datos son “Pedro González Sánchez” y “Juan Torres Campos” nacidos el
“12/2/1972” y “25/9/1975” respectivamente, ambos van a ganar 1400 € y no tendrán comisión.
El primero tiene 1 hijo y el segundo no tiene hijos. Compartirán la extensión telefónica 940.
*/

insert into empleados
(numem, numde, extelem, fecnaem, fecinem, salarem, comisem, numhiem, nomem, ape1em, ape2em, dniem, userem, passem)
values
(567,132,'940','1972/2/12',curdate(),1400,0,1,'Pedro','González', 'Sánchez',default,null,null),
(568,132,'940','1975/9/25',curdate(),1400,0,0,'Juan','Torres', 'Campos',default,null,null);

/* EJERCICIO 6 */
/* Se va a despedir a Juan Torres Campos por no superar el periodo de prueba.*/

delete from empleados
where numem = 568;

/* EJERCICIO 7 */
/*“Dorinda Lara” ha cambiado de departamento, ahora pertenece al departamento
“Organización”, se ha incrementado su sueldo en un 10% y su nueva extensión telefónica es la
910.*/
select * from departamentos; -- ===> buscamos el número de departamento "Organización" ==> 120
update empleados
set numde = 120,
	salarem = salarem*1.1,-- (también: salarem = salarem + salarem*0.10)
    extelem = '910'
where nomem = 'Dorinda' and ape1em = 'Lara' -- 7*5+3*2
	or nomem = 'Pepito' and ape1em = 'Pérez';
    
    
    -- ¡¡OJO!! Corremos el riesgo de que si hay dos Dorindas Lara, se actualizarán los datos de las dos.

-- Incrementa el salario de los empleados del departamento 120 o 130 que lleven más de dos años con nosotros
-- en este caso es importante los paréntesis:

update empleados
set salarem = salarem*1.1
where (numde = 120 or numde = 130) and fecinem <= '2020-2-8';
use bdmuseo;
/* EJERCICIO 11 */
/*Hoy hemos contratado a una nueva empleada de seguridad para sustituir al empleado 1 que
también se jubila hoy. Sus datos son: Carmen Gómez Pérez, su núm. de la seg. social es
“0000000000001”.*/

select * from empleados;
select * from seguridad; -- ==> Buscamos el último empleado y seguridad, 
						 -- así como la sala que vigila el empleado de seguridad 1 (el que se jubila)

start transaction;
insert into empleados
(codemple, nomemle, ape1emple, ape2emple, fecincorp, numsegsoc)
values
(581,'Carmen','Gómez','Pérez', curdate(), '0000000000001');
insert into seguridad
(codsegur, codemple, codsala)
values
(36,581,1);
commit;

/* EJERCICIO 12 */
/*Añade un campo “jubilacion” en la tabla de los empleados. Se trata de la fecha de jubilación de
nuestros empleados, debe permitirse que tenga valores nulos, ya que solo se almacenará dicha
fecha cuando un empleado se jubile.*/
alter table empleados
	add column jubilacion date default null after fecincorp;
    
update empleados
set jubilacion = curdate()
where codemple = 110; -- ==> Se corresponde con el empleado de seguridad 1

/* EJERCICIO 13 */
/*Hace una semana se jubiló el empleado 5, se trata de un restaurador. Las obras que tenía
encargadas se le han asignado al restaurador 2 y se entiende que la fecha de fin de restauración
para nuestro jubilado es la misma que la de jubilación. Por razones que se desconocen no se ha
guardado la información referente a dicha jubilación, subsánalo.*/

-- Hay una errata, no existe el empleado 5, vamos a suponer que se trata del empleado 570 que se corresponde con el rest. 1

update empleados
set jubilacion = date_sub(curdate(), interval 1 week)
where codemple = 570;

-- veamos las restauraciones:
select * from restauraciones; -- ==> buscamos primero las restauraciones. Imaginemos que son 2: obras 6 y 2
-- 1.- El nuevo restaurador continúa los trabajos de restauración
insert into restauraciones
(codrestaurador,codobra, fecinirestauracion, fecfinrestauracion, observaciones)
values
(2, 6, curdate(),null, 'Continúa la restauración. seguirá con el trabajo el restaurador actual por jubilación del rest. 1'),
(2, 2, curdate(),null, 'Continúa la restauración. seguirá con el trabajo el restaurador actual por jubilación del rest. 1');


-- 2.- Acaba el periodo de restauración del restaurador jubilado:
update restauraciones
set fecfinrestauracion = date_sub(curdate(), interval 1 week),
	observaciones = 'restauración no finalizada. seguirá con el trabajo el restaurador 2 por jubilación del actual'
where codrestaurador = 1 
	and (fecfinrestauracion > date_sub(curdate(), interval 1 week) 
			or fecfinrestauracion is null);
-- o también:
-- where codrestaurador = 1 
-- 	and ifnull(fecfinrestauracion, date_add(date_sub(curdate(), interval 1 week)), interval 1 day) > curdate());


/* EJERCICIO 14 */
/*Nuestro museo ha adquirido “El Guernica” de Picasso y lo hemos situado en la sala 3.*/
use BDMuseo;
select * from obras; -- ==> buscamos la última obra 
select * from artistas; -- ==> buscamos a Picasso
start transaction;
insert into obras
(codobra, nomobra, fecadquisicion, codubicacion, codartista)
values
(10, 'Guernica', curdate(), 3, 4);
-- nota.- solo almacenamos los datos que conocemos
/* EJERCICIO 15 */
/*Ha habido un error, no hemos adquirido el cuadro del apartado anterior.*/
delete from obras
where codobra = 10;
/* EJERCICIO 16 */
/*Hemos adquirido “El Grito” de “Edvard Munch”. Este cuadro es de estilo “Expresionismo”.
Este cuadro se ubicará en la sala 5.*/
insert into artistas
(codartista, nomartista)-- , biografia, edad)
values
(99, 'Edvard Munch'); -- , null, null);
insert into obras
(codobra, nomobra, fecadquisicion, codestilo,codubicacion, codartista)
values
(10,'El Grito', curdate(), 4,5,7);
commit;
/* EJERCICIO 17 */
/*Vamos a contratar un nuevo restaurador “Gustavo Sánchez Gómez” especialista en Joan Miró
del que no conocemos de momento más datos, pero tenemos que darlo de alta para asignarle la
restauración de la obra “La Masía” de dicho artista. Esta obra pasará al despacho de
restauración 2 mientras dure la restauración.*/
start transaction;
insert into empleados
(codemple, nomemle, ape1emple, ape2emple, fecincorp)
values
(582,'Gustavo','Sánchez','Gómez', curdate());

insert into restauradores
(codrestaurador, codemple, especialidad)
values
(3, 582, 'Joan Miró');

insert into restauraciones
(codrestaurador, codobra, fecinirestauracion, fecfinrestauracion, observaciones)
values
(3, 1, curdate(), null);
update obras
set ubicacion = 9
where codobra = 1;
commit;
/* EJERCICIO 18 */
/*Anota en el campo “observaciones” para el registro en el que hemos anotado la restauraci n de ṕ
“La Masía” la ubicación que tenía el cuadro antes de comenzar la restauración, para saber
donde debemos devolver dicha obra cuando terminemos con estos trabajos.*/
update restauraciones
set observaciones = 'sala de origen: 1'
where codobra =1 and fecfinrestauracion is null;

/* EJERCICIO 19 */
/*Hemos terminado de restaurar la obra “La Masía”. Devuelve la obra a su lugar de origen.*/
start transaction;
update obras
set ubicacion = 1
where codobra =1;

update restauraciones
set fecfinrestauracion = curdate()
where codobra = 1 and fecfinrestauracion is null;
commit;
/* EJERCICIO 20 */
/*Por necesidades de espacio, hemos habilitado el almacén 2 como “Sala 6”. En esta sala vamos
a ubicar “El tritón alado” y “El angel surrealista”. Asigna 2 guardias de seguiridad a esta sala.*/
start transaction;
update salas
set nomsala = 'Sala 6'
where nomsala = 'Almacén 2';

update obras
set ubicacion = 7
where nomobra = 'El tritón alado' or nomobra = 'El angel surrealista';
commit;