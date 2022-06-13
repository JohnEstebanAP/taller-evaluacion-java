package org.sofka.punto17;

import org.sofka.utilities.Start;

import java.util.ArrayList;
import java.util.List;

/**
 * [Clase App contrlodora para crear barios ojetod del tipo Electredomesticos].
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class App extends Start {
    private List<Electrodomestico> electrodomesticosList = new ArrayList<>();

    /**
     * [Método para ejecutar la creación de los objetos de tipo electrodomesticos].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public void start() {

        crearElectrodomesticos();

        calcularPrecioFinal();

    }

    /**
     * [Método para calcular el precio final que costaran los electrodomésticos].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void calcularPrecioFinal() {

        Double precioTotalLavadora = 0.0;
        Double precioTotalTv = 0.0;
        Double precioTotal = 0.0;

        for (int i = 0; i < electrodomesticosList.size(); i++) {

            if (electrodomesticosList.get(i) instanceof Lavadora) {
                precioTotalLavadora += electrodomesticosList.get(i).precioFinal();
            }

            if (electrodomesticosList.get(i) instanceof Television) {
                precioTotalTv += electrodomesticosList.get(i).precioFinal();
            }

            precioTotal += electrodomesticosList.get(i).precioFinal();

        }

        logMessage("El precio del tv es de: ", precioTotalLavadora.toString());
        logMessage("El precio de la lavadora es de es de: ", precioTotalTv.toString());
        logMessage("El precio Total de los electrodomésticos es de: ", precioTotal.toString());
    }

    /**
     * [Método para rear los 10 objetos de tipo electrodomésticos].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void crearElectrodomesticos() {

        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora();
        Lavadora lavadora3 = new Lavadora(400.0, 102);
        Lavadora lavadora4 = new Lavadora(500.5, "negro", 'D', 80, 9);
        Lavadora lavadora5 = new Lavadora(305.5, "gris", 'B', 70, 7);

        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television(600.0, 10);
        Television tv4 = new Television(900.0, "negro", 'E', 30, 60, true);
        Television tv5 = new Television(780.0, "azul", 'F', 20, 58, false);


        this.electrodomesticosList.add(lavadora1);
        this.electrodomesticosList.add(lavadora2);
        this.electrodomesticosList.add(lavadora3);
        this.electrodomesticosList.add(lavadora4);
        this.electrodomesticosList.add(lavadora5);
        this.electrodomesticosList.add(tv1);
        this.electrodomesticosList.add(tv2);
        this.electrodomesticosList.add(tv3);
        this.electrodomesticosList.add(tv4);
        this.electrodomesticosList.add(tv5);
    }

}
