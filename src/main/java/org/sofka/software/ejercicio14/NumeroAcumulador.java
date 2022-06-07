package org.sofka.software.ejercicio14;

import org.sofka.software.MyPrintAbstract;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [clase donde se imprime un numero hasta llegar a 1000]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class NumeroAcumulador extends MyPrintAbstract {

    public static void main(String[] args) {

        start();
    }

    /**
     * [Método que imprime un mensaje para capturar un número ingresado por teclado]
     * @return Retorna un número entero (Integer), este es el número ingresado
     *          por el usuario capturado con el scanner desde consola
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static Integer scanNumero(){
        Scanner scanner = new Scanner(System.in);
        Integer num = 0;
        try {
            log("Por favor ingrese un número entero");
            num= scanner.nextInt();
        }catch (InputMismatchException e){
            log("Por favor ingrese el número de manera correcta");
            num = scanNumero();
        }
        return num;
    }

    /**
     * [Método de inicio que captura un número y la incrementa de 2 en 2 hasta llegar a 1000]
     *          por el usuario capturado con el scanner desde consola
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void start(){
       Integer num = scanNumero();

       while(num <= 1000){
           log(num.toString());
           num = num + 2;
       }

    }
}
