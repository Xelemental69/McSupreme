use GBDgestionaTests;
/*Obtener el número de alumnos matriculados en cada materia y la nota media de la materia
y el número de expediente de la nota mas alta*/

select concat_ws(' - ', materias.nommateria, materias.cursomateria) as 'Materia', 
	ifnull(count(matriculas.numexped), 0) as 'Nº Alumnos', 
	round(avg(matriculas.nota), 2) as 'Nota media',
	max(matriculas.nota) as 'Nota máxima',
    
    (select mat.numexped 
    from matriculas as mat
	where mat.nota = max(matriculas.nota) and mat.codmateria = matriculas.codmateria
    ) as 'Más alto expediente'

from matriculas join materias on matriculas.codmateria = materias.codmateria
group by matriculas.codmateria;