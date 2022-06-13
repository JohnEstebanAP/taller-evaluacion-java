package org.sofka.punto15;

import org.sofka.utilities.Start;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * [Clase facilita la utilidad de imprimir en consola un Menú de opciones]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class MenuOpciones extends Start {
    static final String[] DIAS = {"\n1: Lunes", "\n2: Martes", "\n3: Miércoles", "\n4: Jueves", "\n5: Viernes", "\n6: Sábado", "\n7: Domingo"};


    /**
     * [Facilita la utilidad de imprimir en consola un Menú de opciones]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public MenuOpciones() {
        //Constructor.
    }

    @Override
    public void start() {
        menu();
    }

    /**
     * [Imprime en consola Menú con las instrucciones para ingresar un número que indica una opción.]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void menu() {

        final String MENU = """
                ****** GESTION CINEMATOGRÁFICA ********
                1-NUEVO ACTOR
                2-BUSCAR ACTOR
                3-ELIMINAR ACTOR
                4-MODIFICAR ACTOR
                5-VER TODOS LOS ACTORES
                6- VER PELICULAS DE LOS ACTORES
                7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                8-SALIR
                                
                Ingrese un número para indicar una opción:
                """;

        log(MENU);

        options(scanNumero());
    }

    /**
     * [Imprime en consola las instrucciones para ingresar un número y comprobar que es un Entero de no ser asi se repite la función]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static int scanNumero() {
        Scanner scanner = new Scanner(System.in);
        int num;
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            log("Por favor ingrese el número de manera correcta");
            num = scanNumero();
        }
        return num;
    }

    /**
     * [Valida la opción selecionada]
     *
     * @param option parámetro de tipo Entero(int) para indicar la opción elegida.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void options(int option) {

        switch (option) {
            case 1:
                menu();
                break;
            case 2:
                menu();
                break;
            case 3:
                menu();
                break;
            case 4:
                menu();
                break;
            case 5:
                menu();
                break;
            case 6:
                menu();
                break;
            case 7:
                menu();
                break;
            case 8:
                log("Salir del menu :)");
                break;
            default:
                log("Selecciona un número correcto.");
                menu();
                break;
        }
    }

}
