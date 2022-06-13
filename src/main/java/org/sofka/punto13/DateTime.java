package org.sofka.punto13;

import org.sofka.utilities.Start;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * [clase donde se calcula la fecha y la hora actual]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class DateTime extends Start {

    /**
     * [Calcula la fecha y la hora actual]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public DateTime() {
        //Constructor.
    }

    /**
     * [Método de inicio de la clase DateTime]
     * imprime en consola la fecha actual en el formato (yyy/MM/dd)(hh:mm:ss)
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void start() {
        comvertir();
    }

    /**
     * [Método que imprime en consola la fecha actual en el formato (yyy/MM/dd)(hh:mm:ss)]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void comvertir() {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (hh:mm:ss)");
        log(formateador.format(fecha));
    }


}