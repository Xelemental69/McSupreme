-- create database probando; Ya existe; dará error :v
show databases;
use probando;

/*Esto es un comentario. Acuérdate para la próxima */

 -- Esto también es un comentario, pero solo en una línea
 
 /*create table konoodioda
 (
 codt1 int not null,
 dest1 varchar(20) not null default 'WRYYYYYYYYYYY',
 constraint pk_konodiooda primary key (codt1)
 ); 
 
 create table konodiegoda
 (
 codt2 int not null,
 dest1 varchar(20) not null default 'WRRRYYYYYYYYYYY',
 codt1 int null,
 constraint pk_konodiegoda primary key (codt2),
 constraint fk_konodiegoda_konodiooda foreign key (codt1) references konodiooda (codt1)
    on delete no action on update cascade
 ); */
 
 create table cars
 (
 codt3 int not null,
 dest3 varchar(20) not null default 'LIGHTO MODO',
 codt4 int not null,
 constraint pk_kars primary key (codt3),
 constraint fk_kars_konodiegoda foreign key (codt4) references konodiooda (codt1)
    on delete no action on update cascade,
 constraint fk_kars_konodiooda foreign key (codt3) references konodiegoda (codt1)
    on delete no action on update cascade
 );