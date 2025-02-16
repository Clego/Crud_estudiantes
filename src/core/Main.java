package core;
import estudiantes.Estudiantes;
import input.Input;
import output.Output;
import estudiantes.GestorEstudiantes;



public class Main {
    private static int optionMenu;
    static final int altaEstudiante = 1;
    static final int bajaEstudiante = 2;
    static final int modificarEstudiante = 3;
    static final int listarEstudiante = 4;
    static final int salir = 5;
    static boolean userWantsToExit = false;

    public static void main(String[] args) {


        do {
            Output.mostrarMenu();
            optionMenu = Input.inputInt();
            Menu(optionMenu);


        } while (!userWantsToExit);
        System.exit(0);


    }
    private static void Menu(int menu) {

        switch(optionMenu) {
            case altaEstudiante:
                break;

            case bajaEstudiante:
                break;

            case modificarEstudiante:
                break;

            case listarEstudiante:
                break;
            case salir:

                userWantsToExit = true;
                break;
        }

    }
}