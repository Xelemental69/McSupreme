/* Obtener el nº de alumnos matriculados en cada materia y la nota media de la misma */
use `GBDgestionaTests`;

select nommateria, count(numexped) as num_alum, round(avg(matriculas.nota), 2) as nota_media
from materias join matriculas
 on materias.codmateria = matriculas.codmateria
 -- where nota >= 5
 group by nommateria; 