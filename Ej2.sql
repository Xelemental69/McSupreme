/*

dptos(pk(numdpto), presup, nomdpto, ubi)
profesores(pk(numdpto*, numprof), despacho, fecnac, fecing, sueldo, nomprof, [jefedepen, dptodepen])
asignatura(pk(numasig), nomasigna, curso)
imparten(pk[numasig*, [numdpto, numprof]*, anio_acad], grupo)

*/

show databases;
create database if not exists ej2;
use ej2;

drop table if exists imparten;

drop table if exists asignaturas;

create table if not exists asignaturas
(

numasig int,
nomasig varchar(60),
curso varchar(20),

constraint pk_asignaturas primary key (numasig)

);

drop table if exists profesores;

drop table if exists dptos;

create table if not exists dptos
(

numdpto int default 0,
nomdpto varchar(60) not null default 'BBDD',
presup decimal (10, 2),
ubic varchar(60),

constraint pk_dptos primary key (numdpto)

);

create table if not exists profesores
(

numprof int default 0,
nomprof varchar(60) default 'Papote',
ap1prof varchar(60) default 'Malote',
ap2prof varchar(60),
fecnacim date null,
fecing date,
sueldo decimal (10, 2),
despacho varchar(25) default 'BBDD',
numdpto int,
numjefe int,
    
constraint pk_profesores primary key (numprof, numdpto),
constraint fk_profesores_dptos foreign key (numdpto) references dptos(numdpto)
	on delete no action on update cascade,
constraint fk_profesores_jefes foreign key (numjefe) references profesores (numprof)
		on delete no action on update cascade

);

create table if not exists imparten 
(

numprof int,
numasig int,
anio_acad char(9),
grupo char(5),

constraint pk_imparten primary key (numprof, numasig, anio_acad),
constraint fk_imparten_profesores foreign key (numprof) references profesores (numprof)
	on delete no action on update cascade,
constraint fk_imparten_asignatura foreign key (numasig) references asignaturas (numasig)
	on delete no action on update cascade

);

alter table profesores
	drop foreign key fk_profesores_jefes,
    add constraint cf_jefes foreign key (numjefe) references profesores (numprof)
		on delete no action on update cascade;