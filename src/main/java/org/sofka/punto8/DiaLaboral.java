package org.sofka.punto8;


import org.sofka.utilities.MyPrintAbstract;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [Clase facilita la utilidad de imprimir en consola si el día seleccionado es un día laboral]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class DiaLaboral extends MyPrintAbstract {
    static final String[] DIAS = {"\n1: Lunes", "\n2: Martes", "\n3: Miércoles", "\n4: Jueves", "\n5: Viernes", "\n6: Sábado", "\n7: Domingo"};

    public static void main(String[] args) {
        menu();


    }
    /**
     * [Imprime en consola Menú con las instrucciones para ingresar un número que indica un día de la semana]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void menu() {

        final String SEPARATOR = "\n----------------------------------------------\n";
        final String MENU = "****************** Menu *********************\n";
        final String OPCIONES = "\ningrese un número para indicar un día: ";

        makeLog("{0}" +
                "{1}" +
                "Por favor seleccione un día de la semana,\n" +
                "para indicar si es un día laboral " +
                "{2}" +
                "{3}" +
                "{4}" +
                "{5}" +
                "{6}" +
                "{7}" +
                "{8}" +
                "{9}" +
                "{0}", new Object[]{SEPARATOR, MENU, OPCIONES, DIAS[0], DIAS[1], DIAS[2], DIAS[3], DIAS[4], DIAS[5], DIAS[6]});

        isWorkingDay(initDatos());
    }
    /**
     * [Imprime en consola las instrucciones para ingresar un número y comprobar que es un Entero de no ser asi se repite la función]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static int initDatos(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try {
            num= scanner.nextInt();
        }catch (InputMismatchException e){
            log("Por favor ingrese el número de manera correcta");
            num = initDatos();
        }
        return num;
    }

    /**
     * [Imprime en consola si el día seleccionado es un dia laborar]
     * @param day parámetro de tipo Entero(int) para indicar el dia de la semana
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void isWorkingDay(int day) {

        final String MESSAGE1 = ", No es un día laboral.";
        final String MESSAGE2 = ", Si es un día laboral.";

        int index = day -1;
        switch (day) {
            case 1:
                logMessage(DIAS[index], MESSAGE2);
                break;
            case 2:
                logMessage(DIAS[index], MESSAGE2);
                break;
            case 3:
                logMessage(DIAS[index], MESSAGE2);
                break;
            case 4:
                logMessage(DIAS[index], MESSAGE2);
                break;
            case 5:
                logMessage(DIAS[index], MESSAGE2);
                break;
            case 6:
                logMessage(DIAS[index], MESSAGE2);
                break;
            case 7:
                logMessage(DIAS[index], MESSAGE1);
                break;
            default:
                log("Selecciona un día correcto.");
                menu();
                break;
        }
    }
}
