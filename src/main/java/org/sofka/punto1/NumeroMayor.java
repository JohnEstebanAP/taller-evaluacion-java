package org.sofka.punto1;

import org.sofka.utilities.Start;

//Declara 2 variables numéricas (con el valor que desees), he indica cuál número es mayor de los dos.
//Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.

/**
 * [Clase facilita la utilidad de imprimir en consola si un número es mayor, menor igual a otro número]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class NumeroMayor extends Start {

    final Double[] numList1 = {2.0, 3.0, 5.0, 0.2, 15.0};
    final Double[] numList2 = {1.0, 4.0, 5.0, 1.0, 1.0};


    /**
     * [Clase facilita la utilidad de imprimir en consola si un número es mayor, menor igual a otro número]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public NumeroMayor() {
        //Constructor.
    }

    /**
     * [inicia el programa de la clase NúmeroMayor]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public void start(){
        numeroMayor(numList1, numList2);
    }

    /**
     * [Imprime en consola si un número es mayor, menor igual a otro número]
     *
     * @param num1 elemento de tipo Double.
     * @param num2 elemento de tipo Double.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void numeroMayor(Double num1, Double num2) {
        if (num1.equals(num2)) {
            makeLog("El número {0} es igual a el número {1} ", new Object[]{num1, num2});
        } else if (num1 > num2) {
            makeLog("El número {0} es mayor a el número {1} ", new Object[]{num1, num2});
        } else {
            makeLog("El número {0} es menor a el número {1} ", new Object[]{num1, num2});
        }
    }

    /**
     * [Imprime en consola si un número es mayor, menor igual a otro número]
     *
     * @param num1 vector de tipo Double.
     * @param num2 vector de tipo Double.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void numeroMayor(Double[] num1, Double[] num2) {
        final String EL_NUMERO = "El número";

        for (int i = 0; i < 5; i++) {
            if (num1[i].equals(num2[i])) {
                logMessage4(EL_NUMERO, num1[i].toString(), "es igual a el número ",  num2[i].toString());
            } else if (num1[i] > num2[i]) {
                logMessage4(EL_NUMERO, num1[i].toString(), "es mayor a el número",  num2[i].toString());
            } else {
                logMessage4(EL_NUMERO, num1[i].toString(), "es menor a el número",  num2[i].toString());
            }
        }
    }

}
