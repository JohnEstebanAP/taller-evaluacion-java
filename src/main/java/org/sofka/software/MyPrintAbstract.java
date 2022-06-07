package org.sofka.software;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase abstracta que facilita la utilidad de imprimir en consola]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public abstract class MyPrintAbstract {

  private static final Logger logger = Logger.getLogger(MyPrintAbstract.class.getName());

  private static final String SEPARATOR = "\n---------------------------------\n";

  /**
     * [Constructor basido de la clase MyprintAbstract.]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    protected MyPrintAbstract() {

    }

  /**
   * [Imprime en consola.
   *
   * Este permite crear una estructura de array pala impresión
   * ej.:
   * makeLog("{1} es un perro de raza {2}, new Object[]{ "tovi", "Golde
   * retriever"});
   * ]
   *
   * @param order   elemento de tipo String que contiene el mensaje y orden de los
   *                elementos a imprimir.
   * @param message Objeto con lita de elementos
   * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public static void makeLog(String order, Object[] message) {
    logger.log(Level.INFO, order, message);
  }

  /**
   * [Imprime en consola un mensaje.
   *
   * ej.:
   * log("hola mundo");
   * ]
   **
   * @param message elemento de tipo String
   * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public static void log(String message) {
    logger.log(
        Level.INFO,
        "{0}"
            + "{1}"
            + "{0}",
        new Object[] { SEPARATOR, message });
  }

  /**
   * [Imprime en consola dos mensajes.
   *
   * ej.:
   * logName("Juan","Hola como estas");
   * ]
   *
   * @param name    elemento de tipo String que contiene un mensaje inicial.
   * @param message elemento de tipo String que contiene un mensaje final.
   * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
   * @since [1.0.0]
   */
  public void logName(String name, String message) {
    logger.log(
        Level.INFO,
        "{0}"
            + "{1} {2}"
            + "{0}",
        new Object[] { SEPARATOR, name, message });
  }
}
