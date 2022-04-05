use GBDgestionaTests;
/*Obtener el número de preguntas de cada test*/

select tests.codtest as numTest, count(preguntas.numpreg) as 'Nº Preguntas'
from tests join preguntas on tests.codtest = preguntas.codtest
group by tests.codtest;