/*
 * Queremos gestionar el alumnado que se presenta a clase.
 *
 * Crea la variable clase como un array de Alumnos
 *
 * Necesitamos poder:
 *      - añadir alumnos a clase
 *          * Se le pregunta al usuario por nombre completo, dni, año de nacimiento
 *      - eliminar alumnos de la clase
 *          * Se le pregunta al usuario por el dni de un alumno. El alumno es eliminado de la lista
 *      - buscar alumnos por nombre parcial
 *          * Se le pregunta al usuario por el nombre de un alumno. El programa lo buscará entre los alumnos del curso
 *          * Ej: jan encontrará a Alejandro y a Alejandra y devolverá un array con los resultados
 *      - buscar alumnos por dni
 *          * Le pregunta al usuario por el dni del alumno. Se devuelve un solo alumno con el dni.
 *      - pasar lista
 *          * Se muestran todos los alumnos preguntando si esta o no esta en clase. El profesor puede marcarlos como S o N
 *      - Mostrar clase
 *          * Se mostrará a todos los alumnos de la clase, si están marcados como ausentes los mostraremos en rojo. (Usa System.err.println())
 *      - Salir
 *          * Saldremos de la clase
 */

public class Clase {

    Alumno[] alumnos = new Alumno[4];


}
