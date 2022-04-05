/*Obtener el número de tests de cada alumno*/
use GBDgestionaTests;

select numexped as 'Alumno', count(codtest) as 'Nº Tests'
from respuestas
group by respuestas.numexped;