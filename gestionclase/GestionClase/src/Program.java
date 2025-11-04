import controller.ClassroomController;
import view.ClassroomView;

public class Program {
    /*
     * Queremos gestionar el alumnado que se presenta a clase.
     *
     * Crea la variable clase como un array de Alumnos
     *
     * Necesitamos poder:
           - añadir students a clase
           - eliminar students de la clase
           - buscar students por nombre parcial
           - buscar students por dni
           - pasar lista
           - Mostrar clase
           - Salir
     */
    public static void main(String[] args) {

        ClassroomView instanceClassView = new ClassroomView();
        ClassroomController controllerClass= new ClassroomController(instanceClassView);

        ClassroomController classroomController = new ClassroomController();

        System.out.println("Hola! ¿Quiéres entrar en la classroomController 8 de 1º de DAM?\n (si/no)");


        classroomController.addAlumno(ClassroomView.askInfoAlumno());

        String nick = ClassroomView.preguntaNick();
        classroomController.searchNameAlumno(nick);
    }

}
