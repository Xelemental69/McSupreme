drop database if exists simt5;
create database simt5;
use simt5;

create table if not exists propietarios (

codpropietario int(11),
monpropietario varchar(100),
personacontacto varchar(100),
dni_cif char(12),
tlf_contacto char(13),
correoelectronico varchar(60),
codtipopropi int(11),

constraint pk_propietarios primary key (codpropietario)

);

create table if not exists tiposcasas (

numtipo int (11),
nomtipo varchar (10),

constraint pk_tiposcasas primary key (numtipo)

);

create table if not exists zonas (

numzona int (11),
nomzona varchar (20),
deszona varchar (200),

constraint pk_zonas primary key (numzona)

);

create table if not exists casas(

codcasa int (11),
nomcasa varchar (20),
numbanos tinyint (4),
numhabit tinyint (4),
m2 int (11),
minpersonas tinyint(4),
maxpersonas tinyint(4),
preciobase decimal (10,2),
codpropietario int (11),
codtipocasa int (11),
codzona int(11),
dirpostal varchar (100),
poblacion varchar (20),
provincia varchar (20),
codpostal char(5),

constraint pk_casa primary key (codcasa),

constraint fk_casa_propietario foreign key (codpropietario) 
references propietarios (codpropietario) on delete no action on update cascade,

constraint fk_casa_tipocasa foreign key (codtipocasa) 
references tiposcasas (numtipo) on delete no action on update cascade,

constraint fk_casa_zona foreign key (codzona) 
references zonas (numzona) on delete no action on update cascade

);

create table if not exists caracteristicas (

numcaracter int (11),
nomcaracter varchar(30),

constraint pk_caracteristicas primary key (numcaracter)

);

create table if not exists caracteristicasdecasa (

codcasa int (11),
codcaracter int (11),
tiene bit (1),
observaciones varchar (120),

constraint pk_caracteristicasdecasa primary key (codcasa, codcaracter),

constraint fk_caracteristicasdecasa_casa foreign key (codcasa) 
references casas (codcasa) on delete no action on update cascade,

constraint fk_caracteristicasdecasa_caracteristicas foreign key (codcaracter) 
references caracteristicas (numcaracter) on delete no action on update cascade

);

create table if not exists clientes (

codcli int (11),
nomcli varchar (20),
ape1cli varchar (20),
ape2cli varchar (20),
dnicli char (9),
tlf_contacto char (13),
correoelectronico varchar (60),
dircli varchar (100),
pobcli varchar (15),
provcli varchar (15),
codpostalcli char (5),

constraint pk_clientes primary key (codcli)

);

create table if not exists reservas (

codreserva int (11),
codcli int (11),
codcasa int (11),
fecreserva date,
pagocuenta decimal (10,2),
feciniestancia date,
numdiasestancia tinyint (4),
fecanulacion date,
observaciones varchar (120),

constraint pk_codreserva primary key (codreserva),

constraint fk_reservas_cliente foreign key (codcli) references clientes (codcli)
on delete no action on update cascade,

constraint fk_reservas_casa foreign key (codcasa) references casas (codcasa)
on delete no action on update cascade

);

create table if not exists devoluciones (

numdevol int (11),
codreserva int (11),
importedevol decimal (10,2),

constraint pk_devoluciones primary key (numdevol),

constraint fk_devoluciones_reserva foreign key (codreserva) references reservas (codreserva)
on delete no action on update cascade

);