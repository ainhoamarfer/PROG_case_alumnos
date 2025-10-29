import java.util.Scanner;

public class ClaseView {
//- añadir students a clase
//*          * Se le pregunta al usuario por nombre completo, dni, año de nacimiento
//*      - eliminar students de la clase
//*          * Se le pregunta al usuario por el dni de un alumno. El alumno es eliminado de la lista
//*      - buscar students por nombre parcial
//*          * Se le pregunta al usuario por el nombre de un alumno. El programa lo buscará entre los students del curso
//*          * Ej: jan encontrará a Alejandro y a Alejandra y devolverá un array con los resultados
//*      - buscar students por dni
//*          * Le pregunta al usuario por el dni del alumno. Se devuelve un solo alumno con el dni.
//           *      - pasar lista
//*          * Se muestran todos los students preguntando si esta o no esta en clase. El profesor puede marcarlos como S o N
//*      - Mostrar clase
//*          * Se mostrará a todos los students de la clase, si están marcados como ausentes los mostraremos en rojo. (Usa System.err.println())
//           *      - Salir
//*          * Saldremos de la clase


    public Object showClass(Clase clase){
        return null;
    }

    /**
     *
     * @return
     */
    public int getMenuOption(){
        System.out.println("");
        return numeroUsuario;
    }

    //funciones
    public static Student askInfoAlumno(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String name = input.nextLine();
        System.out.println("Dime tu DNI");
        String dni = input.nextLine();
        System.out.println("Dime tu día de nacimiento");
        int diaNac = input.nextInt();

        Student studentCreado = new Student(name, dni, diaNac);
        return studentCreado;
    }

}
