package org.sofka.punto12;

import org.sofka.utilities.Start;

import java.util.Scanner;

/**
 * [permite de acuerdo a una frase pasada por consola,
 * indicar cuál es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class CompararParabras extends Start {

    /**
     * [permite de acuerdo a una frase pasada por consola,
     * indicar cuál es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public CompararParabras() {
        //Constructor.
    }

    /**
     * [inicia el programa de la clase Comparar Palabras]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        final String messageMenu = """
                ********************Comparación de palabras******************
                    toma dos palabras y las campara diciendo si son iguales
                    o sus diferencias""";
        logMessage(messageMenu,"");
        log("por favor ingrese la palabra 1:");
        String palabra1 = scanner.nextLine();
        palabra1 = palabra1.toLowerCase().replaceAll("\\s", "");
        log("por favor ingrese la palabra 2:");
        String palabra2 = scanner.nextLine();
        palabra2 = palabra2.toLowerCase().replaceAll("\\s", "");

        if (palabra1.equals(palabra2)) {
            log("Las palabras son iguales");
        } else {
            makeLog("\nLas palabras son diferentes \npues la palabra 1 tiene: {0} letras,\ny la palabra 2 tiene: {1} letras \nTienen una diferencia de {2} letras ", new Object[]{palabra1.length(), palabra2.length(), Math.abs(palabra1.length() - palabra2.length())});
        }
    }

}
