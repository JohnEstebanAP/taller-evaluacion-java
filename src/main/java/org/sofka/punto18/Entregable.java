package org.sofka.punto18;

public interface Entregable {

    /**
     * [Método cambia el atributo prestado a true.].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    void entregar();

    /**
     * [Método cambia el atributo prestado a false].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    void devolver();

    /**
     * [Método devuelve el estado del atributo prestado].
     *
     * @return boolean
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    boolean isEntregado();

    /**
     * [Método compara las horas estimadas en los videojuegos
     *   y en las series el número de temporadas].
     *
     * @return int
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    int compareTo(Object a);

}
