package org.sofka.punto6;

import org.sofka.utilities.Start;

import java.util.ArrayList;

/**
 * [Clase que facilita la utilidad de imprimir en consola los números pares e impares]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class NumerosParesInparesFor extends Start
{

    /**
     * [Facilita la utilidad de imprimir en consola los números pares e impares]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public NumerosParesInparesFor() {
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
        imprimirNumerosParesImpares();
    }


    /**
     * [Imprime en consola las instruciones para ingresar el precio]
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void imprimirNumerosParesImpares(){

        ArrayList<Integer> pares =  new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for( int contador =1; contador <= 100 ; contador++){
            if (contador % 2 == 0) {
                pares.add(contador);
            } else {
                impares.add(contador);
            }
        }

        logMessage("Números pares: ", pares.toString());
        logMessage("Números impares: ", impares.toString());
    }


}
