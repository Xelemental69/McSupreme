/*

sujetos(pk(codsujeto), nomSujeto, ap1Sujeto, ap2Sujeto, dni, dPostal, eMail, tlf)
clientes(pk(codcli), estCivil, codsujeto*)
abogaaados(pk(codabgdo), numColeg, codsujeto*)
llevan(pk(idCaso*, codabgdo*), fecini, numdias)
tipoCasos(pk(idTipoCaso), descTipoCaso)
casos(pk(idCaso, idTipoCaso*), desCaso, presupuesto, codcli*)

*/

drop database if exists ExG1;
create database if not exists ExG1;
use ExG1;

create table if not exists sujetos (

	codsujeto int,
    nomsujeto varchar (20),
    ap1sujeto varchar (20),
    ap2sujeto varchar (20),
    dni char (9),
    dPostal varchar (100),
    email varchar (50),
    tlf char (9),
    
    constraint pk_sujetos primary key (codsujeto),
    
    constraint email_unico unique (email)

);

create table if not exists clientes (

	codcli int,
    codsujeto int,
    estCivil enum('S', 'C', 'D', 'V'),
    
    constraint pk_clientes primary key (codcli),
    
    constraint fk_clientes_sujetos foreign key (codsujeto)
    references sujetos(codsujeto) on delete no action on update cascade

);

create table if not exists abogados (

	codabgd int,
    numColeg char (8),
    codsujeto int,
    
    constraint pk_abogado primary key (codabgd),
    
    constraint fk_abogados_sujetos foreign key (codsujeto)
    references sujetos(codsujeto) on delete no action on update no action

);

create table if not exists tipoCasos (

	idTipoCaso int,
    desTipoCaso varchar(50),
    
    constraint pk_tipoCasos primary key (idTipoCaso)

);

create table if not exists casos (

	idCaso int,
    codcli int,
    idTipoCaso int,
    desCaso varchar(50),
    presupuesto decimal (7,2),
    
    constraint pk_casos primary key (idCaso, idTipoCaso),
    
    constraint fk_casos_tiposCasos foreign key (idTipoCaso)
    references tipoCasos(idTipoCaso) on delete no action on update cascade,
    
    constraint fk_casos_clientes foreign key (codcli)
    references clientes(codcli) on delete no action on update cascade

);

create table if not exists abogadosEnCasos (

	idCaso int,
    idTipoCaso int,
    codabgd int,
    fecini date,
    numdias tinyint unsigned,
    
    constraint pk_abogadosEnCasos primary key (idCaso, idTipoCaso, codabgd),
    
    constraint fk_abogadosEnCasos_casos foreign key (idCaso, idTipoCaso) references
    casos (idCaso, idTipoCaso) on delete no action on update cascade,
    
    constraint fk_abogadosEnCasos_abogados foreign key (codabgd) references
    abogados (codabgd) on delete no action on update cascade
    
    
    );
    
alter table abogadosEnCasos
	drop foreign key fk_abogadosEnCasos_casos,
	drop primary key;
    
alter table casos
	drop primary key,
    add column tipocaso set ('Civil', 'Penal', 'Laboral', 'Admin', 'Familia') after idCaso,
    drop foreign key fk_casos_tiposcasos;