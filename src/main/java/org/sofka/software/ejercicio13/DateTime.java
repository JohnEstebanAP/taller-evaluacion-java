package org.sofka.software.ejercicio13;

import org.sofka.software.MyPrintAbstract;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * [clase donde se calcula la fecha y la hora actual]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class DateTime extends MyPrintAbstract {
    public static void main(String[] args) throws ParseException {
        comvertir();
    }

    /**
     * [Método que inprime en consola la fecha actual en el formato (yyy/MM/dd)(hh:mm:ss)]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void comvertir() throws ParseException {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (hh:mm:ss)");
        log(formateador.format(fecha));
    }


}