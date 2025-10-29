/*
 * Queremos gestionar el alumnado que se presenta a clase.
 *
 * Crea la variable clase como un array de Alumnos
 *
 * Necesitamos poder:
 *      - eliminar students de la clase
 *          * Se le pregunta al usuario por el dni de un alumno. El alumno es eliminado de la lista
 *      - buscar students por nombre parcial
 *          * Se le pregunta al usuario por el nombre de un alumno. El programa lo buscará entre los students del curso
 *          * Ej: jan encontrará a Alejandro y a Alejandra y devolverá un array con los resultados
 *      - buscar students por dni
 *          * Le pregunta al usuario por el dni del alumno. Se devuelve un solo alumno con el dni.
 *      - pasar lista
 *          * Se muestran todos los students preguntando si esta o no esta en clase. El profesor puede marcarlos como S o N
 *      - Mostrar clase
 *          * Se mostrará a todos los students de la clase, si están marcados como ausentes los mostraremos en rojo. (Usa System.err.println())
 *      - Salir
 *          * Saldremos de la clase
 */

public class Clase {

    private ClaseView claseView;
    Student[] students = new Student[4];
    private int count = 0;


    public Clase() {
        claseView = new ClaseView();
    }

    public ClaseView getClaseView() {
        return claseView;
    }

    public void setClaseView(ClaseView claseView) {
        this.claseView = claseView;
    }

    public Student[] getAlumnos() {
        return students;
    }

    public void setAlumnos(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //funciones

    public void addAlumno(Student student){
        students[count] = student;
        count++;
    }

    public void deleteAlumno(Student student){
        return null;
    }

    public void searchNameAlumno(String apodo){
        for(Student student : students) {
            if (student.getName().toLowerCase().contains(apodo.toLowerCase())) {
                System.out.println(student);
            }
        }
    }

    public void searchDNIAlumno(String  searchedDni){
        for(Student student : students) {
            if (student.getDni() == searchedDni){
                System.out.println(student.getName());
            }
        }
    }

    public void takeRollCall(Student student, student[]){
        for(int i = 0; i < students.length; i++) {
            System.out.println(student + "estas?");
        }if (student.attendance() == true){
            student = Student[i]
        }
    }
}
