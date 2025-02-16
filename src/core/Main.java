package core;

import estudiantes.Estudiantes;
import estudiantes.GestorEstudiantes;
import input.Input;
import output.Output;

public class Main {
    private static int optionMenu;
    static final int altaEstudiante = 1;
    static final int bajaEstudiante = 2;
    static final int modificarEstudiante = 3;
    static final int listarEstudiante = 4;
    static final int salir = 5;
    static boolean userWantsToExit = false;
    static GestorEstudiantes gestorEstudiantes = new GestorEstudiantes();

    public static void main(String[] args) {
        do {
            Output.mostrarMenu();
            optionMenu = Input.inputInt();
            Menu(optionMenu);
        } while (!userWantsToExit);
        System.exit(0);
    }

    private static void Menu(int optionMenu) {
        switch (optionMenu) {
            case altaEstudiante:
                altaEstudiante();
                break;
            case bajaEstudiante:
                bajaEstudiante();
                break;
            case modificarEstudiante:
                modificarEstudiante();
                break;
            case listarEstudiante:
                listarEstudiantes();
                break;
            case salir:
                userWantsToExit = true;
                break;
        }
    }

    private static void altaEstudiante() {
        Output.estudiante();
        Output.cualID();
        int id = Input.inputInt();
        Output.cualNombre();
        String nombreCompleto = Input.inputString();
        Output.cualEdad();
        int edad = Input.inputInt();
        Output.cualFecha();
        String fechaNacimiento = Input.inputString();
        Output.cualAsignatura();
        String asignatura1 = Input.inputString();
        Output.cualNota();
        int notaAsignatura1 = Input.inputInt();
        Output.cualAsignatura();
        String asignatura2 = Input.inputString();
        Output.cualNota();
        int notaAsignatura2 = Input.inputInt();

        Estudiantes estudiante = new Estudiantes(id, nombreCompleto, edad, fechaNacimiento, asignatura1, notaAsignatura1, asignatura2, notaAsignatura2);
        gestorEstudiantes.altaEstudiante(estudiante);
    }


    private static void bajaEstudiante() {
        gestorEstudiantes.listarEstudiantes();
        Output.eliminarEstudiante();
        int id = Input.inputInt();
        gestorEstudiantes.bajaEstudiante(id);
    }

    private static void modificarEstudiante() {
        gestorEstudiantes.listarEstudiantes();
        Output.modificarEstudiante();
        int id = Input.inputInt();
        Output.nuevaNota();
        int nuevaNota = Input.inputInt();
        gestorEstudiantes.modificarEstudiante(id, nuevaNota);
    }

    private static void listarEstudiantes() {
        gestorEstudiantes.listarEstudiantes();
    }
}