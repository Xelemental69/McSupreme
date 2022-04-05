use `GBDgestionaTests`;

/* Nº de materias matriculadas de cada alumno */
 
 select concat(nomalum, ' ', ape1alum, ' ', ifnull(ape2alum, '')), count(codmateria),
 round(avg(matriculas.nota), 2) as nota_media, alumnos.numexped
from alumnos left join matriculas
 on alumnos.numexped = matriculas.numexped
 -- where nota >= 5
 group by numexped;