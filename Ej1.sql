/*
centros(pk(numce), nomce, dirce)
dpto(pk(numce*, numdpto), presupuesto, nomdpto, [dptodepen, centrodepen])
empleados(pk(numem), extelef, fecnac, fecingr, sal, com, numhij, nomem, [numce*, numde*]) 
dirigir(pk[numem*, [numce, numde]*, fecinidir], ..., [numce, numde])

*/
show databases;
create database if not exists ej1;
use ej1;

create table if not exists centros
(
numce int not null default 0,
nomce varchar(60) not null default 'Mar Alborán',
dirce varchar(60) default 'C/ Pablo Alborán',

constraint pk_centros primary key(numce)

);

create table if not exists dptos
(
numdpto int default 0,
nomdpto varchar(60) not null default 'BBDD',
presup decimal not null default 13000,
numce int,

constraint pk_dptos primary key (numdpto, numce),
constraint fk_dptos_centros foreign key (numce) references centros(numce)
	on delete no action on update cascade

);

create table if not exists empleados 
(
numem int not null default 0,
nomem varchar(60) not null default 'Pepito',
ap1em varchar(60) not null default 'El',
ap2em varchar(60) default 'Chocolatero',
comision int default 100,
salario int default 100,
extelf varchar(4) default '+34',
numhijos tinyint unsigned,
fecnac date,
fecing date,
numce int,
numdpto int,

constraint pk_emp primary key (numem),
constraint fk_emp_centros foreign key(numce) references centros(numce)
	on delete no action on update cascade,
constraint fk_emp_dpto foreign key(numdpto) references dptos(numdpto)
	on delete no action on update cascade

);

create table if not exists dirigir -- Crea una tabla
(
numemdir int,
numde int,
numce int,
fecinidir date,
fecfindir date null,

constraint pk_dirigir primary key (numemdir, numde, numce, fecinidir),
constraint fk_dirigir_dpto foreign key (numde) references dptos (numdpto)
	on delete no action on update cascade,
constraint fk_dirigir_centro foreign key (numce) references centros (numce)
	on delete no action on update cascade



);

drop table if exists dirigir; -- Elimina una tabla

create table if not exists dirigir
(
numemdir int,
numde int,
numce int,
fecinidir date,
fecfindir date null,

constraint pk_dirigir primary key (numemdir, numde, numce, fecinidir),
constraint fk_dirigir_dpto foreign key (numde) references dptos (numdpto)
	on delete no action on update cascade,
constraint fk_dirigir_centro foreign key (numce) references centros (numce)
	on delete no action on update cascade



);

alter table dptos -- Modifica una tabla
	add column dptodepen int,
    add column centrodepen int,
    add constraint fk_dptos_dptos foreign key (dptodepen, centrodepen) references dptos (numdpto, numce)
		on delete no action on update cascade;