package org.sofka.punto9;
//Del texto, “La sonrisa sera la mejor arma contra la tristeza”
// Reemplaza todas las a del String anterior por una e,
// adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola
// y las muestre luego unidas.

import org.sofka.utilities.Start;

import java.util.Scanner;

/**
 * Toma la frase "La sonrisa será la mejor arma contra la tristeza" y reemplaza las letras a por e
 * además de que concatena un mensaje adicional ingresado por consola.
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class RemplazarPalabras extends Start {

    /**
     * Toma la frase "La sonrisa será la mejor arma contra la tristeza" y reemplaza las letras a por e
     * además de que concatena un mensaje adicional ingresado por consola.
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public RemplazarPalabras() {
        //Constructor.
    }

    /**
     * [inicia el programa de la clase RemplazarPalabras]
     * [Método main donde se ejecuta el programa]
     * Toma la frase "La sonrisa será la mejor arma contra la tristeza" y reemplaza las letras a por e
     * además de que concatena un mensaje adicional ingresado por consola.
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void start() {
        final String SEPARATOR = "--------------------------------------------------------------------------";
        String message = "La sonrisa será la mejor arma contra la tristeza ";
        String message2 = "Se reemplazaran todas las (a) dela frase anterior por una (e)";
        String message3 = ("por favor ingrese una frase que le desee adicionar a la oración:");

        makeLog("{0} \n{1} \n{2} \n{3} \n{0}", new Object[]{SEPARATOR, message, message2, message3});
        Scanner scanner = new Scanner(System.in);
        String message4 = scanner.nextLine();
        log(message.replace('a', 'e').replace('á','e' ).concat(message4));
    }

}
