use `empresaclase1`;

select empleados.*, nomde
from empleados join departamentos
		on empleados.numde = departamentos.numde;
        
