package org.sofka.punto3;

import org.sofka.utilities.Start;

import java.util.InputMismatchException;
import java.util.Scanner;

//Haz una aplicación que calcule el área de un círculo(pi*R2).
// El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
// Usa la constante PI y el método pow de Math
/**
 * [Clase facilita la utilidad de imprimir en consola el area de un círculo]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class AreaCirculo extends Start {

    /**
     * [inicia el programa de la clase AreaCirculo]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public void start(){
        Double aria = initDatos();
        calculeAreaCirculo(aria);
    }


    /**
     * [Imprime en consola las instrucciones para ingresar un número.]
     * @return Double radio ingresado
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static Double initDatos(){
        Scanner scanner = new Scanner(System.in);

        Double num;
        try {
            log("Por favor ingrese el radio del círculo} (ej: 5,2)");
            num= scanner.nextDouble();
        }catch (InputMismatchException e){
            log("Por favor ingrese el número de manera correcta");
            num = initDatos();
        }
        return num;
    }


    /**
     * [Calcula el aria de un círculo]
     *
     * @param radio radio del círculo de tipo Double
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void calculeAreaCirculo(Double radio){
        double areaCirculo = (Math.pow(radio, 2) * Math.PI);
        makeLog("El area del círculo es de: {0}", new Object[]{areaCirculo} );
    }

}
