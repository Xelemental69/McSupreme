USE `empresaclase`;

insert into centros (numce, nomce, dirce)
values 
(10, 'SEDE CENTRAL', 'C.ALCALA, 820, MADRID'),
(20, 'RELACION CON CLIENTES', 'C.ATOCHA, 405, MADRID');

insert into departamentos (numde, numce, presude, nomde)
values
(100, 10, 129000, 'DIRECCION GENERAL');

insert into departamentos (numde, numce, presude, depende, nomde)
values
(110, 20, 100000, 100, 'DIRECC.COMERCIAL'),
(111, 20, 90000, 110, 'SECTOR INDUSTRIAL'),
(112, 20, 175000, 110, 'SECTOR SERVICIOS'),
(120, 10, 50000, 100, 'ORGANIZACION'),
(110, 10, 74000, 120, 'PERSONAL'),
(110, 10, 68000, 120, 'PROCESO DE DATOS'),
(110, 10, 85000, 100, 'FINANZAS');

insert into empleados (numem, numde, extelem, 
fecnaem, fecinem, salarem, numhiem, nomem, ap1em,
passwordem, dniem)
values
(110, 121, 350, '1965-04-30', '1985-03-15', 1000, 2
, 'PEPA', 'PEREZ', '00F879D9B1621846A084F067D7EF020C0100000061A520C81BB263AF00F0F62F30EB569354B23E8DF370C641241160042C05527E9F6335F919A693FA5370650EADA7DC53', '27111000a'),
(120, 112, 840, '1970-09-10', '1995-10-01', 1200, 3
, 'JUAN', 'LOPEZ', '00F879D9B1621846A084F067D7EF020C01000000E693555B8983BEFA4D4E358C292DCBE0B89655657BA9459CF60FD12242CB650863CE3E23BDCFFFBE037959E70C4F0CFC', '23000111b'),
(130, 112, 810, '1958-03-30', '1988-03-01', 987, 1
, 'ANA', 'GARCIA', '00F879D9B1621846A084F067D7EF020C0100000009286ADCD19C5A1659C2350355D882BF9EFA10D177B31F1189E6D6CCC6F8E31848E6F776A1C11ED10256686AE897A355', '45222111c');

insert into empleados (numem, numde, extelem, fecnaem, fecinem, salarem, numhiem, nomem, ape1em)
/*

150	121	340	1972-01-15	2001-01-15	856		0	JULIA	VARGAS																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
160	111	740	1969-03-18	2002-03-18	998		4	PEPA	CANALES																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
190	121	350	1969-01-22	1997-01-22	1174		0	LUISA	GOMEZ
210	100	200	1964-02-24	1986-02-24	3000		3	CESAR	PONS
280	130	410	1964-02-15	2000-02-15	978		2	MARCOS	PEREZ
310	130	480	1971-01-15	1993-01-15	1125		3	LAVINIA	SANZ
320	122	620	1957-02-05	1978-02-05	1235		0	ADRIANA	ALBA
350	122	610	1949-09-10	1984-09-10	864		3	OCTAVIO	GARCIA
370	121	360	1967-06-22	1987-01-20	999,99		0	OTILIA	POLO
380	112	880	1968-03-30	1988-01-01	1111		3	GLORIA	GUIL
370	121	360	1967-06-22	1987-01-20	999,99		0	OTILIA	POLO
380	112	880	1968-03-30	1988-01-01	1111		3	GLORIA	GUIL
430	122	650	1967-10-26	1988-11-19	1196		2	MICAELA	MARTIN
450	112	880	1966-10-21	1986-02-28	1112		0	LUCRECIA	LARA
500	111	750	1965-10-08	1988-01-01	1009		0	VALERIANA	MORA
510	110	550	1966-05-04	1987-01-01	1532		0	LIVIA	DURAN
560	111	780	1980-09-10	2000-11-10	999		1	HONORIA	TORRES


*/
