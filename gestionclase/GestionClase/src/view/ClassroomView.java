package view;

import controller.ClassroomController;
import model.StudentDTO;

import java.util.Scanner;

public class ClassroomView {



    private static final int MIN_MENU = 1;
    private static final int MAX_MENU = 7;

    public void showMenu(int numStudents){
        System.out.println("\nNº estudiantes en clase: " + numStudents);
        System.out.println("Menu, selecciona una opcion:\n" +
        "1.Añadir students a clase\n" +
        "2.Eliminar students de la clase\n" +
        "3.Buscar students por nombre parcial\n" +
        "4.Buscar students por dni\n" +
        "5.Pasar lista\n" +
        "6.Mostrar clase\n" +
        "7.Salir\n");
    }

    public int getMenuOption(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int opcion = sc.nextInt();
            if(opcion >= MIN_MENU && opcion <= MAX_MENU){
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
        int birthDate = sc.nextInt();

        studentDTOReturn = new StudentDTO(name, dni, birthDate);

        return studentDTOReturn;
    }

    public String getString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }

   // public boolean askStudentAttendance(int numberStudent, StudentDTO[]){
   //     Scanner sc = new Scanner(System.in);
   //     System.out.println(StudentDTO[numberStudent].getName() + "estas?");
//
   // }

   // public int showAndGetMenu(){
   //     showMenu();
   //     return getMenuOption();
   // }

    public void showStudentByDni(StudentDTO foundStudentDTO){

        if(foundStudentDTO != null){
            System.out.println("Ese alumno es" + foundStudentDTO.getName() + "\n" +
            "Con DNI: " + foundStudentDTO.getDni() + "\n" +
            "Año nacimiento: " + foundStudentDTO.getBirthDate());
        }else {
            showError("No se encontró el alumno");
        }
    }

    public void showStudentByNickname(StudentDTO[] foundStudents, int foundStudentsCount) {
        for(int i = 0; i < foundStudentsCount; i++){
            showStudentByDni(foundStudents[i]);
            System.out.println("\n=====================" + i + "=====================\n");
        }
    }

    public Object showClass(ClassroomController classroomController){
        return null;
    }

    public void showError(String msg) {
        System.err.println(msg);
    }


}
