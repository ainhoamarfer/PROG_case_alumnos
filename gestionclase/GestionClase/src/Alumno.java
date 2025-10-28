public class Alumno {
    //Se le pregunta al usuario por nombre completo, dni, año de nacimiento
    private String name;
    private int dni;
    private int birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public Alumno(String name, int dni, int birthDate) {
        this.name = name;
        this.dni = dni;
        this.birthDate = birthDate;
    }

}
