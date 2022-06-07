package org.sofka.software.ejercicio9;
//Del texto, “La sonrisa sera la mejor arma contra la tristeza”
// Reemplaza todas las a del String anterior por una e,
// adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola
// y las muestre luego unidas.

import org.sofka.software.MyPrintAbstract;

import java.util.Scanner;

/**
 * Toma la frase "La sonrisa será la mejor arma contra la tristeza" y reemplaza las letras a por e
 * además de que concatena un mensaje adicional ingresado por consola.
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class RemplazarPalabras extends MyPrintAbstract {
    static final String MESSAGE =  "La sonrisa será la mejor arma contra la tristeza ";

    /**
     * [Método main donde se ejecuta el programa]
     * Toma la frase "La sonrisa será la mejor arma contra la tristeza" y reemplaza las letras a por e
     * además de que concatena un mensaje adicional ingresado por consola.
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        log(MESSAGE);
        log("Se reemplazaran todas las (a) dela frase anterior por una (e)");
        log("por favor ingrese una frase que le desee adicionar a la oración:");
        Scanner scanner = new Scanner(System.in);
        String message= scanner.nextLine();
        log(MESSAGE.replace('a','e').concat(message));
    }



}
