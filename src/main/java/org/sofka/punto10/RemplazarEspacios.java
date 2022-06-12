package org.sofka.punto10;

import org.sofka.utilities.Start;

import java.util.Scanner;

/**
 * [clase donde se ingresa una frase por teclado y elimina los espacios en blanco]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class RemplazarEspacios extends Start {

    /**
     * [Se ingresa una frase por teclado y elimina los espacios en blanco]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public RemplazarEspacios() {
        //Constructor.
    }

    /**
     * [inicia el programa de la clase RemplazarEspacios]
     * se ingresa una frase por teclado y elimina los espacios en blanco para finalmente imprimir el resultado por consola
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void start() {
        final String SEPARATOR = "--------------------------------------------------------------------------";
        String message1 = "Se eliminaran todas los espacios de dela frase";
        String message2 = "por favor ingrese una frase:";

        makeLog("\n{0} \n{1} \n{2} \n{0}", new Object[]{SEPARATOR, message1, message2,});
        Scanner scanner = new Scanner(System.in);
        String message4 = scanner.nextLine();
        logMessage(message4.replace(" ", ""), "");
    }

}
