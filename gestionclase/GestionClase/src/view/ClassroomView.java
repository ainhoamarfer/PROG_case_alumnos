package view;

import controller.ClassroomController;
import model.StudentDTO;

import java.util.Scanner;

public class ClassroomView {



    private static final int MIN_MENU = 1;
    private static final int MAX_MENU = 7;

    public void showMenu(){
        System.out.println("Selecciona una opcion:" +
        "- añadir students a clase\n" +
        "- eliminar students de la clase\n" +
        "- buscar students por nombre parcial\n" +
        "- buscar students por dni\n" +
        "- pasar lista\n" +
        "- Mostrar clase\n" +
        "- Salir\n");
    }

    public int getMenuOption(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int opcion = sc.nextInt();
            if(opcion <= MIN_MENU || opcion >= MAX_MENU){
                return opcion;
            }
        }
    }

    public StudentDTO getInfoStudent() {
        StudentDTO studentDTOReturn;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del alumno");
        String name = sc.nextLine();

        System.out.println("Dime su DNI");
        String dni = sc.nextLine();

        System.out.println("Dime el año de nacimiento");
        int birthDate = sc.nextLine();

        studentDTOReturn = new StudentDTO(name, dni, birthDate);

        return studentDTOReturn;
    }


    public int showAndGetMenu(){
        showMenu();
        return getMenuOption();
    }

    public Object showClass(ClassroomController classroomController){
        return null;
    }

    public void showError() {
        System.err.println("Error");
    }
}
