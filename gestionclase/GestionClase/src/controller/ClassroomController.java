package controller;

import model.StudentDTO;
import view.ClassroomView;

import java.util.Scanner;

public class ClassroomController {

    //atributos
    private ClassroomView instanceClassView;
    private static final int MAX_STUDENTS = 1;
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

//Funciones

    //ejecución del programa
    public void executeOptionMenu(){

        while(true){
            instanceClassView.showMenu(count);

            int op = instanceClassView.getMenuOption();

            if(op == 1){
                addStudent();
            }
            //if(op == 2){
            //    deleteStudent();
            //}
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
                getStudentOutOfClass();
            }
        }
    }

    //1. añadir alumnos al aula
    public void addStudent(){
        if(count == MAX_STUDENTS){
            instanceClassView.showError("La clase ya está llena");
            return;
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
    public void searchNameStudent(){
        String nickname = instanceClassView.getString("Dime el apodo del alumno que quieres buscar");

        StudentDTO[] foundStudents = new StudentDTO[count];
        int countFoundStudents = 0;

        for(int i = 0; i < count; i++) {
            if (studentDTOS[i].getName().contains(nickname)) {
                foundStudents[countFoundStudents] = studentDTOS[i];
                countFoundStudents++;
            }
        }
        instanceClassView.showStudentByNickname(foundStudents, countFoundStudents);
    }

    //4. buscar studentDTOS por dni
    public void searchDNIStudent(){
        String dni = instanceClassView.getString("Dime el DNI del alumno que quieres buscar");

        //no existe el concepto de objeto vacío, tienes que decir que en principio no hay nada
        StudentDTO foundStudentDTO = null;

        for(StudentDTO studentDTO : studentDTOS) {
            if (studentDTO.getDni().equals(dni)){
                foundStudentDTO = studentDTO;
                instanceClassView.showStudentByDni(foundStudentDTO);
                break;
            }
        }
    }

    //5. pasar lista
    public void takeRollCall(){
      //for(int i = 0; i < studentDTOS.length; i++) {
      //    instanceClassView.askStudentAttendance(i, StudentDTO[])
      //    System.out.println(studentDTOS[i].getName() + "estas?");

      //    if (StudentDTO.attendance() == true){
      //        studentDTO = StudentDTO[i]
      //    }
      //}

    }

    //6. Mostrar clase (pasar a view)
    private void showClassroom() {
        for(int i = 0; i < count; i++) {
            System.out.println(studentDTOS[count]);
        }
    }
    
    //7. salir de la clase
    public void getStudentOutOfClass (){
        System.out.println("Dime el DNI del alumno que quieres eliminar");
        Scanner sc = new Scanner(System.in);
        String dni = sc.nextLine();
        int newCount = 0;

        StudentDTO[] newStudents = new StudentDTO[MAX_STUDENTS];

        for(int i = 0; i < count; i++) {
            if(!studentDTOS[i].getDni().equalsIgnoreCase(dni)){
                newStudents[newCount] = studentDTOS[i];
                newCount++;
            }
        }

        studentDTOS = newStudents;
        count = newCount;
    }
}
