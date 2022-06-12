package org.sofka.punto4;

import org.sofka.utilities.Start;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * [Clase facilita la utilidad de imprimir en consola el precio de un producto con el IVA incluido]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class PrecioConIVA extends Start {

    private float iva = 0.21f;

    /**
     * [Clase facilita la utilidad de imprimir en consola el precio de un producto con el IVA incluido]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public PrecioConIVA() {
      //constructor.
    }


    /**
     * [inicia el programa de la clase precioConIva]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public void start() {
        Double precio = initDatos();
        calcularPrecioIVA(precio);
    }

    /**
     * [Imprime en consola las instruciones para ingresar el precio]
     *
     * @return precio ingresado por consola de tipo Double
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public Double initDatos() {
        Scanner scanner = new Scanner(System.in);

        Double precio;
        try {
            log("Por favor ingrese el precio del producto (ej: 10000,50)");
            precio = scanner.nextDouble();
        } catch (InputMismatchException e) {
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
    public void calcularPrecioIVA(Double precio) {
        double precioIVA = (precio * iva) + precio;
        logMessage("El precio con el IVA incluido es de: ", String.valueOf(precioIVA));
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
}
