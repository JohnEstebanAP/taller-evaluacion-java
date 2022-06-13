package org.sofka.software;

import org.sofka.punto1.NumeroMayor;
import org.sofka.punto10.RemplazarEspacios;
import org.sofka.punto11.LongitudFraseVocales;
import org.sofka.punto12.CompararParabras;
import org.sofka.punto13.DateTime;
import org.sofka.punto2.NumeroMayor2;
import org.sofka.punto3.AreaCirculo;
import org.sofka.punto4.PrecioConIVA;
import org.sofka.punto5.NumerosParesInparesWhile;
import org.sofka.punto6.NumerosParesInparesFor;
import org.sofka.punto7.NumeroMayorIgualAcero;
import org.sofka.punto8.DiaLaboral;
import org.sofka.punto9.RemplazarPalabras;
import org.sofka.utilities.Start;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 * [Clase que facilita la utilidad de imprimir en consola un Menu con opciones y ejecutar los puntos seleccionados.]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.2.0
 * @since Esta presente desde la version 1.0.0
 */
public class Main extends Menu {

    protected static List<Start> puntos = new ArrayList<>();

    /**
     * [Método de inicio de la Clase Menu]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.2.0]
     */
    public static void main(String[] args) {
        setPuntos(new NumeroMayor());
        setPuntos(new NumeroMayor2());
        setPuntos(new AreaCirculo());
        setPuntos(new PrecioConIVA());
        setPuntos(new NumerosParesInparesWhile());
        setPuntos(new NumerosParesInparesFor());
        setPuntos(new NumeroMayorIgualAcero());
        setPuntos(new DiaLaboral());
        setPuntos(new RemplazarPalabras());
        setPuntos(new RemplazarEspacios());
        setPuntos(new LongitudFraseVocales());
        setPuntos(new CompararParabras());
        setPuntos(new DateTime());

        startMenu();
    }

    /**
     * [Método de inicialización del menu]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.2.0]
     */
    public static void startMenu() {
        List<String> elemenst = new ArrayList<>();

        final String SEPARATOR = "--------------------------------------------------------------------------";
        final String MENU = " ********************************* Menu *********************************";
        final String MESSAGE = "  Por favor seleccione la opción que desea ejecutar";
        final String OPCIONES = "  ingrese un número para indicar un opción: ";

        elemenst.add(SEPARATOR);
        elemenst.add(MENU);
        elemenst.add(MESSAGE);
        elemenst.add(OPCIONES);
        elemenst.add("\n");
        elemenst.add("  1: punto 1 - Indica cuál número es mayor de los dos o si son iguales.");
        elemenst.add("  2: punto 2 - Se ingresan dos números en consola e imprime \n" +
                "               si un número es mayor, menor o igual a otro número.");
        elemenst.add("  3: punto 3 - Calcula el are de un circulo.");
        elemenst.add("  4: punto 4 - Calcula el precio de un producto con IVA.");
        elemenst.add("  5: punto 5 - imprime una lista de números pares e impares con el ciclo While.");
        elemenst.add("  6: punto 6 - imprime una lista de números pares e impares con el ciclo For.");
        elemenst.add("  7: punto 7 - Indica si un número es mayor o igual a cero.");
        elemenst.add("  8: punto 8 - Indica si un dia seleccionado es un dia laboral.");
        elemenst.add("""  
                . 9: punto 9 - Del texto, “La sonrisa sera la mejor arma contra la tristeza”
                               Reemplaza todas las A del String anterior por una E,
                               adicionalmente concatenara a esta una frase adicional
                               que ustedes quieran incluir.""");
        elemenst.add("  10: punto 10 - Se ingresa una frase por teclado y elimina los espacios en blanco.");
        elemenst.add("  11: punto 11 - Indicar cual es la longitud de una frase,\n" +
                "                 adicionalmente cuantas vocales tiene.");
        elemenst.add("  12: punto 12 - toma dos palabras y las campara diciendo si son iguales \n" +
                "                 o sus diferencias.");
        elemenst.add("  13: punto 13 - se calcula la fecha y la hora actual.");
        elemenst.add("  14: punto 14 - De un numero inicial se incrementara en saltos de 2 asta el 1000.");
        elemenst.add("  15: punto 15 - Simulación de en menu de opciones");
        elemenst.add("  16: punto 16 - .");
        elemenst.add("  17: punto 17 - .");
        elemenst.add("  18: punto 18 - .");
        elemenst.add("  19: punto Extra - Creación de naves espaciales.");
        elemenst.add("  20: Salir");

        setElemenstMenu(elemenst);
        showMenu();
        int option = initDatos();
        selectionIntro(option);
    }

    /**
     * [Imprime en consola las instrucciones para ingresar un número y comprobar que es un Entero de no ser asi se repite la función]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.2.0]
     */
    public static int initDatos() {
        Scanner scanner = new Scanner(System.in);
        int num;
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            showMenu();
            log("Por favor ingrese el número de manera correcta");
            num = initDatos();
        }
        return num;
    }

    /**
     * [ejecuta la opción seleccionada]
     *
     * @param option parámetro de tipo Entero(int) para indicar la opción seleccionada.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.2.0]
     */
    public static void selectionIntro(int option) {
        option = option - 1;
        if (option < 19 && option >= 0) {
            logMessage("La opción seleccionada es", elemenst.get(option+5));
            Main.puntos.get(option).start();
        }else if(option ==19){
            logMessage("La opción seleccionada es", elemenst.get(option+5));
        } else {
            showMenu();
            log("Por favor ingrese una opción correcta");
            int num = initDatos();
            selectionIntro(num);
        }
    }

    /**
     * [Método para asignarle a la Lista de Objetos las tareas o clase a instance para ser ejecutadas]
     *
     * @param punto parámetro de tipo Entero(Objeto).
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.2.0]
     */
    public static void setPuntos(Start punto) {
        Main.puntos.add(punto);
    }
}
