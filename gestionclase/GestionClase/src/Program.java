import controller.ClassroomController;
import view.ClassroomView;

public class Program {
    /*
     * Queremos gestionar el alumnado que se presenta a clase.
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

        controllerClass.executeOptionMenu();
    }

}
