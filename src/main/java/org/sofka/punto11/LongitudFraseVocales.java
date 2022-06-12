package org.sofka.punto11;

import org.sofka.utilities.Start;

import java.util.Scanner;
//Realizar la construcción de un algoritmo que permita de acuerdo a una frase
// pasada por consola, indicar cual es la longitud de esta frase,
// adicionalmente cuantas vocales tiene de “a,e,i,o,u”.

/**
 * [clase donde se ingresa una frase por teclado e imprime la longitud de la frase y la cantidad de bocales]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class LongitudFraseVocales extends Start {

    /**
     * [Se ingresa una frase por teclado e imprime la longitud de la frase y la cantidad de bocales]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public LongitudFraseVocales() {
        //Constructor.
    }


    /**
     * [inicia el programa de la clase LongitudFraseVocales]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void start() {
        log("por favor ingrese una frase:");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        Integer cantidadPalabras = message.replace(" ", "").length();
        Integer cantidadVocalA = (cantidadPalabras - (message.toLowerCase().replace("a", "").replace(" ", "")).length());
        Integer cantidadVocalE = (cantidadPalabras - (message.toLowerCase().replace("e", "").replace(" ", "")).length());
        Integer cantidadVocalI = (cantidadPalabras - (message.toLowerCase().replace("i", "").replace(" ", "")).length());
        Integer cantidadVocalO = (cantidadPalabras - (message.toLowerCase().replace("o", "").replace(" ", "")).length());
        Integer cantidadVocalU = (cantidadPalabras - (message.toLowerCase().replace("u", "").replace(" ", "")).length());

        final String VECES = "veces";

        logMessage("Frase: ", message);
        logMessage3("Esta frase tiene: ", cantidadPalabras.toString(), " letras.");
        logMessage3("La vocal A se repite: ", cantidadVocalA.toString(), VECES);
        logMessage3("La vocal E se repite: ", cantidadVocalE.toString(), VECES);
        logMessage3("La vocal I se repite: ", cantidadVocalI.toString(), VECES);
        logMessage3("La vocal O se repite: ", cantidadVocalO.toString(), VECES);
        logMessage3("La vocal U se repite: ", cantidadVocalU.toString(), VECES);
    }

}
