-- create database probando; Ya existe; dará error :v
show databases;
create database if not exists probando;
use probando;

/*Esto es un comentario. Acuérdate para la próxima */

 -- Esto también es un comentario, pero solo en una línea
 
 create table if not exists konodioda
 (
 codt1 int not null,
 dest1 varchar(20) not null default 'WRYYYYYYYYYYY',
 constraint pk_konodioda primary key (codt1)
 ); 
 
 create table if not exists konodiegoda
 (
 codt2 int not null,
 dest1 varchar(20) not null default 'WRRRYYYYYYYYYYY',
 codt1 int null,
 constraint pk_konodiegoda primary key (codt2),
 constraint fk_konodiegoda_konodioda foreign key (codt1) references konodioda (codt1)
    on delete no action on update cascade
 ); 
 
 create table if not exists cars
 (
 codt3 int not null,
 dest3 varchar(20) not null default 'LIGHTO MODO',
 codt4 int not null,
 constraint pk_kars primary key (codt3),
 constraint fk_kars_konodiegoda foreign key (codt4) references konodiegoda (codt1)
    on delete no action on update cascade,
 constraint fk_kars_konodioda foreign key (codt3) references konodioda (codt1)
    on delete no action on update cascade
 );