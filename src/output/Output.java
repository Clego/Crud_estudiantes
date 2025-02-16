package output;

public class Output {

    public static void mostrarMenu() {
        System.out.println("""
                Bienvenido al CRUD de estudiantes!
                 Que quieres hacer?
                 1. Añadir estudiante(Max.2)
                 2. Quitar estudiante
                 3. Modificar estudiante
                 4. Listar estudiantes
                 5. Salir
                """);

    }

    public static void estudiante() {
        System.out.println("Introduce los datos del estudiante:");
    }

    public static void cualID() {
        System.out.println("Introduce el ID: ");
    }

    public static void cualNombre() {
        System.out.print("Introduce nombre completo:  ");
    }

    public static void cualEdad() {
        System.out.print("Edad: ");
    }

    public static void cualFecha() {
        System.out.print("Introduce la fecha de nacimiento (DD/MM/AA): ");
    }

    public static void cualAsignatura() {
        System.out.print("En que asignatura se ha matriculado?: ");
    }

    public static void cualNota() {
        System.out.println("Que nota tiene?: ");
    }

    public static void eliminarEstudiante() {
        System.out.print("Introduce el ID del estudiante a eliminar: ");
    }

    public static void modificarEstudiante() {
        System.out.print("Introduce el ID del estudiante a editar: ");
    }

    public static void nuevaNota() {
        System.out.print("Introduce la nueva nota de la primera asignatura: ");
    }

    public static void noEncontrado() {
        System.out.println("Estudiante no encontrado.");
    }

    public static void lleno() {
        System.out.println("Esta lleno");
    }
    public static void eliminado() {
        System.out.println("Estudiante eliminado.");
    }
    public static void modificado() {
        System.out.println("Nota modificada.");
    }


}
