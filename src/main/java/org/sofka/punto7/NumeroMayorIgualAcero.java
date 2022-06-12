package org.sofka.punto7;


import org.sofka.utilities.Start;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [Clase facilita la utilidad de imprimir en consola si un número es mayor o igual al cero]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class NumeroMayorIgualAcero extends Start {
    Double num1 = 0.0;

    /**
     * [Facilita la utilidad de imprimir en consola si un número es mayor o igual al cero]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public NumeroMayorIgualAcero() {
        //Constructor.
    }

    /**
     * [inicia el programa de la clase precioConIva]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public void start() {
        do {
            num1 = initDatos();
        } while (numeroMayor(num1, 0.0));
    }

    /**
     * [Imprime en consola las instrucciones para ingresar un número y decirnos si un número es mayor, menor igual a otro número]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static Double initDatos() {
        Scanner scanner = new Scanner(System.in);

        Double num;
        try {
            log("Por favor ingrese un número (ej: 5,2)");
            num = scanner.nextDouble();
        } catch (InputMismatchException e) {
            log("Por favor ingrese el número de manera correcta");
            num = initDatos();
        }
        return num;
    }

    /**
     * [Imprime en consola si un número es mayor, menor igual a otro número]
     *
     * @param num1 elemento de tipo Double.
     * @param num2 elemento de tipo Double.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static boolean numeroMayor(Double num1, Double num2) {
        if (num1.equals(num2)) {
            logMessage4("El número", num1.toString(), "es igual a el número", num2.toString());
            return false;
        } else if (num1 > num2) {
            logMessage4("El número", num1.toString(), "es mayor a el número", num2.toString());
            return false;
        }
        return true;
    }

}
