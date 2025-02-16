package estudiantes;
import output.Output;

public class GestorEstudiantes {
    private Estudiantes[] estudiantesTotal;
    private int contadorEstudiantes;

    public GestorEstudiantes() {
        estudiantesTotal = new Estudiantes[2];
    }

    public void altaEstudiante(Estudiantes estudiante) {
        if (estudiantesTotal.length > contadorEstudiantes) {
            estudiantesTotal[contadorEstudiantes] = estudiante;
            contadorEstudiantes++;
        } else {
            Output.lleno();
        }
    }

    public void bajaEstudiante(int idEstudiante) {
        for (int i = 0; i < contadorEstudiantes; i++) {
            if (estudiantesTotal[i].getIdEstudiante() == idEstudiante) {
                for (int j = i; j < contadorEstudiantes - 1; j++) {
                    estudiantesTotal[j] = estudiantesTotal[j + 1];
                }
                estudiantesTotal[contadorEstudiantes - 1] = null;
                contadorEstudiantes--;
                Output.eliminado();
                return;
            }
        }
        Output.noEncontrado();
    }

    public void modificarEstudiante(int idEstudiante, int nuevaNota) {
        for (int i = 0; i < contadorEstudiantes; i++) {
            if (estudiantesTotal[i].getIdEstudiante() == idEstudiante) {
                estudiantesTotal[i].setNotaAsignatura1(nuevaNota);
                Output.modificado();
                return;
            }
        }
        Output.noEncontrado();
    }

    public void listarEstudiantes() {
        System.out.println("ID\tNombre Completo\tAsignatura 1 (Nota)\tAsignatura 2 (Nota)");
        for (int i = 0; i < contadorEstudiantes; i++) {
            Estudiantes estudiante = estudiantesTotal[i];
            System.out.println(estudiante.getIdEstudiante() + "\t" +
                    estudiante.getNombreCompleto() + "\t" +
                    estudiante.getAsignatura1() + " (" + estudiante.getNotaAsignatura1() + ")\t" +
                    estudiante.getAsignatura2() + " (" + estudiante.getNotaAsignatura2() + ")");
        }
    }
}