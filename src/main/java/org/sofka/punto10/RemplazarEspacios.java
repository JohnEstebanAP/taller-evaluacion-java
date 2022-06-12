package org.sofka.punto10;

import org.sofka.utilities.MyPrintAbstract;

import java.util.Scanner;
/**
 * [clase donde se ingresa una frase por teclado y elimina los espacios en blanco]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class RemplazarEspacios extends MyPrintAbstract {
    /**
     * [Método main donde se ejecuta el programa]
     * se ingresa una frase por teclado y elimina los espacios en blanco para finalmente imprimir el resultado por consola
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        log("Se eleminaran todas los espacios de dela frase");
        log("por favor ingrese una frase:");
        Scanner scanner = new Scanner(System.in);
        String message= scanner.nextLine();
        log(message.replace(" ",""));
    }


}
