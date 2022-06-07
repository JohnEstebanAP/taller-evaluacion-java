package org.sofka.software.ejercicio7;

import org.sofka.software.MyPrintAbstract;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [Clase facilita la utilidad de imprimir en consola si un número es mayor o igual al cero]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class NumeroMayorIgualAcero extends MyPrintAbstract {
    static Double num1 = 0.0;

    public static void main(String[] args) {
        do{
            num1 = initDatos();
        }while(numeroMayor(num1, 0.0));

    }

    /**
     * [Imprime en consola las instrucciones para ingresar un número y decirnos si un número es mayor, menor igual a otro número]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static Double initDatos(){
        Scanner scanner = new Scanner(System.in);

        Double num = 0.0;
        try {
            log("Por favor ingrese un número (ej: 5,2)");
            num= scanner.nextDouble();
        }catch (InputMismatchException e){
            log("Por favor ingrese el número de manera correcta");
            num = initDatos();
        }
        return num;
    }

    /**
     * [Imprime en consola si un número es mayor, menor igual a otro número]

     * @param num1  elemento de tipo Double.
     * @param num2  elemento de tipo  Double.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static boolean numeroMayor(Double num1,Double num2){
        if(num1.equals(num2)){
            makeLog("El número {0} es igual a el número {1} ",new Object[]{ num1, num2});
            return false;
        }else if(num1 > num2){
            makeLog("El número {0} es mayor a el número {1} ",new Object[]{ num1, num2});
            return false;
        }
        return true;
    }
}
