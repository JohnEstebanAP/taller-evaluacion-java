package org.sofka.punto1;

import org.sofka.utilities.MyPrintAbstract;

//Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
// Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.

/**
 * [Clase facilita la utilidad de imprimir en consola si un número es mayor, menor igual a otro número]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class  NumeroMayor extends MyPrintAbstract {

    /**
     * [Imprime en consola si un número es mayor, menor igual a otro número]
     *
     * @param num1 elemento de tipo Double.
     * @param num2 elemento de tipo  Double.
     * @return
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void numeroMayor(Double num1, Double num2){
        if(num1.equals(num2)){
            makeLog("El número {0} es igual a el número {1} ",new Object[]{ num1, num2});
        }else if(num1 > num2){
            makeLog("El número {0} es mayor a el número {1} ",new Object[]{ num1, num2});
        }else{
            makeLog("El número {0} es menor a el número {1} ",new Object[]{ num1, num2});
        }
    }
    /**
     * [Imprime en consola si un número es mayor, menor igual a otro número]

     * @param num1  vector de tipo Double.
     * @param num2  vector de tipo Double.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void numeroMayor(Double[] num1, Double[] num2){
        for(int i = 0; i < 5; i++){
            if(num1[i].equals(num2[i])){
                makeLog("El número {0} es igual a el número {1} ",new Object[]{ num1[i], num2[i]});
            }else if(num1[i] > num2[i]){
                makeLog("El número {0} es mayor a el número {1} ",new Object[]{ num1[i], num2[i]});
            }else{
                makeLog("El número {0} es menor a el número {1} ",new Object[]{ num1[i], num2[i]});
            }
        }
    }


    public static void main(String[] args) {
        final Double[] num1 = {2.0, 3.0, 5.0 , 0.2, 15.0};
        final Double[] num2 = {1.0, 4.0, 5.0 , 1.0, 1.0};

        numeroMayor(num1,num2);
    }
}
