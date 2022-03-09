drop database if exists SimuG1;
create database if not exists SimuG1;
use SimuG1;

/*

sujetos(pk(codSujeto), nomSujeto, ap1Sujeto, ap2Sujeto, dni, dPostal, email, tlf)
clientela(pk(codCli, codSujeto*), estCivil)
abogaaaaaaados(pk(codAbogado, codSujeto*), numColegiado)
llevan(pk(idCaso*, codAbogado*), fecIni, numDias)
casos(pk(idCaso, codCli*, idTipoCaso), desCaso)
tipoCasos(pk(idTipoCaso), desTipoCaso)

*/
