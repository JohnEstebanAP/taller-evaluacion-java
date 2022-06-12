package org.sofka.punto2;

import org.sofka.punto1.NumeroMayor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [Clase facilita la utilidad de imprimir en consola si un número es mayor, menor igual a otro número]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class NumeroMayor2 extends NumeroMayor {

    static Double num1 = 0.0;
    static Double num2 = 0.0;

    public static void main(String[] args) {
        num1 = initDatos(1);
        num2 = initDatos(2);
        numeroMayor(num1, num2);
    }

    /**
     * [Imprime en consola las instruciones pa ingresar dos numeros y decirnos si un número es mayor, menor igual a otro número]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static Double initDatos(int index){
        Scanner scanner = new Scanner(System.in);

        Double num = 0.0;
        try {
            makeLog("Por favor ingrese el número {0} (ej: 5,2)",new Object[]{index});
            num= scanner.nextDouble();
        }catch (InputMismatchException e){
            log("Por favor ingrese el número de manera correcta");
            num = initDatos(index);
        }
        return num;
    }
}
