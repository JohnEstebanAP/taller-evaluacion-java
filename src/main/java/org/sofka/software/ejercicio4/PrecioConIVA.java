package org.sofka.software.ejercicio4;

import org.sofka.software.MyPrintAbstract;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [Clase facilita la utilidad de imprimir en consola el precio de un producto con el IVA incluido]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class PrecioConIVA extends MyPrintAbstract {

    private static final float IVA = 0.21f;
    /**
     * [Imprime en consola las instruciones para ingresar el precio]
     * @return precio ingresado por consola de tipo Double
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static Double initDatos(){
        Scanner scanner = new Scanner(System.in);

        Double precio = 0.0;
        try {
            log("Por favor ingrese el precio del producto (ej: 10000,50)");
            precio= scanner.nextDouble();
        }catch (InputMismatchException e){
            log("Por favor ingrese el número de manera correcta");
            precio = initDatos();
        }
        return precio;
    }


    /**
     * [Calcula e imprime el precio con IVA de un producto]
     *
     * @param precio del círculo de tipo Double
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void calcularPrecioIVA(Double precio){
        Double precioIVA = (precio * IVA) + precio;
        makeLog("El precio con el IVA incluido es de: {0}", new Object[]{precioIVA} );
    }

    public static void main(String[] args) {
        Double precio = initDatos();
        calcularPrecioIVA(precio);
    }
}
