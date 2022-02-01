/*** P1. ESQUEMA RELACIONAL */
/*
empleados(PK(codempleado), nomempleado)
cuidadores(PK(codcuidador),codemple*, descripcion)
veterinarios(PK(codveter),codemple*, especialidad)
zonas (PK(codzona), nomzona)
recintos(PK(codrecinto, codzona), nomrecinto, codcuidador*)
ejemplares(PK(codejem), nomejem, clase, alimentacion, codveter*, codpadre*,codmadre*)
localizacionEjemplares(PK(coejem,[codrecinto,codzona]*),feciniestancia,fecfinestancia,observaciones)

*/

/** P2. IMPLEMENTACIÓN EN MYSQOL **/

create database zoo_exam_u4_2021_g2;
use zoo_exam_u4_2021_g2;
-- empleados(PK(codemple), nomemple)
create table empleados
(
	codemple int,
    nomemple varchar(20),
    ape1emple varchar(20),
    ape2emple varchar(20),
	constraint pk_empleados primary key (codemple)
);
-- cuidadores(PK(codcuidador),codemple*, descripcion)
create table cuidadores
(
	codcuidador int,
    codemple int,
    descripcion varchar(200),
    constraint pk_cuidadores primary key (codcuidador),
    constraint fk_cuidadores_empleados foreign key (codemple) references empleados(codemple)
		on delete no action on update cascade
);
-- veterinarios(PK(codveter),codemple*, especialidad)
create table veterinarios
(
	codveter int,
    codemple int,
    especialidad varchar(20),
    constraint pk_veterinarios primary key (codveter),
    constraint fk_veterinarios_empleados foreign key (codemple) references empleados(codemple)
		on delete no action on update cascade 
);
-- zonas (PK(codzona), nomzona)
 create table zonas
(
	codzona int,
    deszona varchar(40),
	constraint pk_zonas primary key (codzona)
);
-- recintos(PK(codrecinto, codzona), nomrecinto, codcuidador*)

create table recintos
(
	codrecinto int,
    codzona int,
    nomrecinto varchar(20),
    codcuidador int,
    constraint pk_recintos primary key (codrecinto,codzona),
    constraint fk_recintos_zonas foreign key (codzona) references zonas(codzona)
		on delete no action on update cascade,
	constraint fk_recintos_cuidadores foreign key (codcuidador) references cuidadores(codcuidador)
		on delete set null on update cascade -- pedido en el enunciado
);
-- ejemplares(PK(codejem), nomejem, clase, alimentacion, codveter*, codpadre*,codmadre*)

create table ejemplares
(
	codejem int,
    nomejem varchar(20), -- unique,
    clase enum ('P','AN','R','AV','M'),
    alimentacion set ('H','C','I','F'),
    codveter int,
    codpadre int,
    codmadre int,
	constraint pk_ejemplares primary key (codejem),
    constraint nombre_unico unique (nomejem),
    constraint fk_ejemplares_veterinarios foreign key (codveter) references veterinarios(codveter)
		on delete no action on update cascade,
	constraint fk_ejemplares_ejempadre foreign key (codpadre) references ejemplares(codejem)
		on delete no action on update cascade,
	constraint fk_ejemplares_ejemmadre foreign key (codmadre) references ejemplares(codejem)
		on delete no action on update cascade
);
-- localizacionEjemplares(PK(coejem,[codrecinto,codzona]*),feciniestancia,fecfinestancia,observaciones)
create table localizacionEjemplares
(
	codejem int,
    codrecinto int,
    codzona int,
    feciniestancia date,
    fecfinestancia date,
    observaciones varchar(200), -- text
	constraint pk_localizacionEjemplares primary key (codejem,codrecinto, codzona, feciniestancia),
    
    constraint fk_localizacionEjemplares_ejemplares foreign key (codejem) references ejemplares(codejem)
		on delete no action on update no action, -- pedido en el enunciado
	constraint fk_localizacionEjemplares_recintos foreign key (codrecinto,codzona) references recintos(codrecinto, codzona)
		on delete no action on update cascade
);
/** P3. MODIFICACIÓN DE ESTRUCTURA **/
/* P2.1 */

alter table empleados
	add column salarem decimal(6,2) unsigned not null default 900;

/* P2.2 */

alter table ejemplares
	add column edad tinyint unsigned,
    add column fecnacim datetime;
   
/* P2.3 */

alter table localizacionEjemplares
	drop foreign key fk_localizacionEjemplares_ejemplares,
    drop foreign key fk_localizacionEjemplares_recintos,
	drop primary key,
    add column codlocalizacion int auto_increment, 
    add constraint pk_localizacionEjemplares_new primary key (codlocalizacion),
    add constraint fk_localizacionEjemplares_ejemplares_new foreign key (codejem) references ejemplares(codejem)
		on delete no action on update no action, -- pedido en el enunciado
	add constraint fk_localizacionEjemplares_recintos_new foreign key (codrecinto,codzona) references recintos(codrecinto, codzona)
		on delete no action on update cascade
    ;
    

