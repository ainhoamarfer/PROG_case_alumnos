import java.util.Scanner;

public class Student {
    //Se le pregunta al usuario por nombre completo, dni, año de nacimiento
    private String name;
    private String dni;
    private int birthDate;
    private boolean attendance;

    //getters y setters
    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    //constructors
    public Student(String name, String dni, int birthDate) {
        this.name = name;
        this.dni = dni;
        this.birthDate = birthDate;
        this.attendance = false;
    }

    public boolean getInOrOutOfClass (String answer){
        //System.out.println("Hola! ¿Quiéres entrar en la clase 8 de 1º de DAM?\n (si/no)");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();

        if (answer.equals("no")) {
            return false;
        }else return true;
    }

}
