package controller;

import model.StudentDTO;
import view.ClassroomView;
import java.util.Scanner;

public class ClassroomController {

    private ClassroomView instanceClassView;

    private static final int MAX_STUDENTS = 30;
    private StudentDTO[] studentDTOS = new StudentDTO[MAX_STUDENTS];

    //CUANDO NO SABES CUANTOS ELEMENTOS HAY EN UN ARRAY SE HACE UN COUNT
    private int count = 0;
    
//getters y setters
    public ClassroomView getInstanceClassView() {
        return instanceClassView;
    }
    public void setInstanceClassView(ClassroomView instanceClassView) {
        this.instanceClassView = instanceClassView;
    }
    public StudentDTO[] getStudent() {
        return studentDTOS;
    }
    public void setStudent(StudentDTO[] studentDTOS) {
        this.studentDTOS = studentDTOS;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public ClassroomController(ClassroomView instanceClassView) {
        this.instanceClassView = instanceClassView;
        //si no metes el ClassroomView por parámetro y lo metes dentro como new solo podrá usar esa única view
    }

//funciones

    public void executeOptionMenu(){
        instanceClassView.showMenu();
        int op = instanceClassView.getMenuOption();
        if(op == 1){
            addStudent();
        }
        if(op == 2){
            deleteStudent();
        }
        if(op == 3){
            searchNameStudent();
        }
        if(op == 4){
            searchDNIStudent();
        }
        if(op == 5){
            takeRollCall();
        }
        if(op == 6){
            showClassroom();
        }
        if(op == 7){
            getInOrOutOfClass();
        }
    }

    //1. añadir alumnos al aula
    public void addStudent(){
        if(count == MAX_STUDENTS){
            instanceClassView.showError();
        }

        StudentDTO studentDTO = instanceClassView.getInfoStudent();
        studentDTOS[count] = studentDTO;
        count++;
    }

    //2. eliminar alumnos del aula
    public Object deleteStudent(StudentDTO studentDTO){
        return null;
    }

    //3. buscar studentDTOS por nombre parcial
    public void searchNameStudent(String apodo){
        for(StudentDTO studentDTO : studentDTOS) {
            if (studentDTO.getName().toLowerCase().contains(apodo.toLowerCase())) {
                System.out.println(studentDTO);
            }
        }
    }

    //4. buscar studentDTOS por dni
    public void searchDNIStudent(String  searchedDni){
        for(StudentDTO studentDTO : studentDTOS) {
            if (studentDTO.getDni() == searchedDni){
                System.out.println(studentDTO.getName());
            }
        }
    }

    //5. pasar lista
    public void takeRollCall(){
      // for(int i = 0; i < studentDTOS.length; i++) {
      //     System.out.println(studentDTO + "estas?");
      // }if (studentDTO.attendance() == true){
      //     studentDTO = StudentDTO[i]
      // }
    }

    //6. Mostrar clase
    private void showClassroom() {}
    
    //7. salir de la clase
    public boolean getInOrOutOfClass (String answer){
        //System.out.println("Hola! ¿Quiéres entrar en la clase 8 de 1º de DAM?\n (si/no)");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();

        if (answer.equals("no")) {
            return false;
        }else return true;
    }
}
