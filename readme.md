## Se solicita la implementación de un programa que gestione las altas, bajas, listados y modificaciones de los datos del alumnado de 1º de Informática.

### Altas
El sistema solicitará la introducción de los datos de 2 alumnos.
El usuario introducirá los siguientes datos por cada alumno:

id único.

Nombre completo

edad

fecha de nacimiento: el sistema no validará la introducción de estos datos (día, mes y año). El usuario introducirá datos correctos (no es correcto el 30 de febrero de 2030 et alters).

2 asignaturas en las que está matriculada esta persona (el nombre de las mismas puede ser ficticio).
para cada asignatura:
el usuario introducirá la nota obtenida en la primera evaluación (entre 0 y 10. El sistema no validará la introducción de estos datos).
### bajas
El sistema mostrará un listado de los alumnos (solo nombre completo) junto con la información de las asignaturas (nombre y nota). El formato de este listado tendrá que ser el mismo que se solicita en el apartado de Listado (ver más abajo).
El sistema solicitará al usuario qué alumno quiere dar de baja.
El usuario introducirá el identificador del alumno al cual quiere dar de baja.
El sistema eliminará este alumno.
### Modificación
El sistema mostrará un listado de los alumnos junto con la información de las asignaturas (nombre y nota).  El formato de este listado tendrá que ser el mismo que se solicita en el apartado de Listado (ver más abajo).
El sistema solicitará al usuario que introduzca el identificador del cual se quiere modificar la nota de la primera asignatura.
El usuario introducirá un valor entre 0 y 10 (el sistema no validará la introducción de este dato).
El sistema asignará la nueva nota a esa asignatura de ese alumno.
### Listado
El sistema mostrará, en formato tabular, la información de cada alumno.
Las columnas, en este orden, será:
id, nombre completo, asignatura 1 (nota de esta asignatura), asignatura 2 (nota de esta asignatura).