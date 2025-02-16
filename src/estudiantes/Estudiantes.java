package estudiantes;

public class Estudiantes {
    int idEstudiante;
    String nombreCompleto;
    int edad;
    String fechaNacimiento;
    String asignatura1;
    int notaAsignatura1;
    String asignatura2;
    int notaAsignatura2;

    public Estudiantes(int id, String nombreCompleto, int edad, String fechaNacimiento, String asignatura1, int noteAsignatura1, String asignatura2, int notaAsignatura2) {
        this.idEstudiante = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignatura1 = asignatura1;
        this.notaAsignatura1 = noteAsignatura1;
        this.asignatura2 = asignatura2;
        this.notaAsignatura2 = notaAsignatura2;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;

    }
    public String getFechaNacimiento() {
    return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getAsignatura1() {
        return asignatura1;
    }
    public void setAsignatura1(String asignatura1) {
        this.asignatura1 = asignatura1;
    }
    public int getNotaAsignatura1() {
        return notaAsignatura1;
    }
    public void setNotaAsignatura1(int notaAsignatura1) {
        this.notaAsignatura1 = notaAsignatura1;
    }
    public String getAsignatura2() {
        return asignatura2;
    }
    public void setAsignatura2(String asignatura2) {
        this.asignatura2 = asignatura2;
    }
    public int getNotaAsignatura2() {
        return notaAsignatura2;
    }
    public void setNotaAsignatura2(int notaAsignatura2) {
        this.notaAsignatura2 = notaAsignatura2;
    }
}
