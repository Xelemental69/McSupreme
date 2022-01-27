/*

empleados(pk(codempl), nomempl, ap1empl, ap2empl, fecing, numss)
artistas(pk(codart), nomart, ap1art, ap2art)
estilos(pk(codestilos), nomestilo, descestilo)
tipoObras(pk(codtipobras), nomtipobras)
salas(pk(codsalas) nomsala)
seguridad(pk(codseg, codempl*, codsalas*), observaciones)
restauradores(pk(codrest, codempl*), especialidad)
obras(pk(codobras, codtipobras*, codsalas*, codart*, codestilos*),
nomobra, descobra, feccrea, fecadq, valD)

*/

create database if not exists muuseuu;
use muuseuu;