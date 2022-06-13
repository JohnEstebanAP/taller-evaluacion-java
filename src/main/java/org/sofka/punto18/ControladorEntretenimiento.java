package org.sofka.punto18;

import org.sofka.utilities.Start;

import java.util.ArrayList;
import java.util.List;

/**
 * [Clase controlador para los objetos serie y Vidiojuego.]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.2.0
 * @since Esta presente desde la version 1.0.0
 */
public class ControladorEntretenimiento extends Start {
    List<Serie> seriesList = new ArrayList<>();
    List<Videojuego> videojuegosList = new ArrayList<>();

    /**
     * [Método start para iniciar el programa desde el menu.]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public void start() {
        crearSeriesList();
        crearVideojuegosList();

        //Entrega algunos Videojuegos y Series con el método entregar().

        //se entregar algunas series
        seriesList.get(1).entregar();
        seriesList.get(2).entregar();
        seriesList.get(3).entregar();

        //se entregan algunos videojuegos
        videojuegosList.get(1).entregar();
        videojuegosList.get(2).entregar();

        contarEntregados();

        mayorTiempo();
    }

    /**
     * [Imprime en la consola la serie y videojuego com más tiempo y temporadas de una lista].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void mayorTiempo() {
        Serie serie = seriesList.get(0);
        for (Serie element1 : seriesList) {
            for (Serie element2 : seriesList) {
                if (serie.compareTo(element2) != 1) {
                    serie = element2;
                }
            }
        }

        Videojuego videojuego = videojuegosList.get(0);
        for (Videojuego element1 : videojuegosList) {
            for (Videojuego element2 : videojuegosList) {
                if (videojuego.compareTo(element2) != 1) {
                    videojuego = element2;
                }
            }
        }


        logMessage("La serie con mas temporadas es:", serie.toString());
        logMessage("El juego con mas horas es:", videojuego.toString());
    }

    /**
     * [Cuenta la cantidad de series y videojuegos en las listas e imprime en la consola
     *  estos elementos entregados y es total de elementos entregados].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void contarEntregados() {
        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;

        for (int i = 0; i < seriesList.size(); i++) {
            if (seriesList.get(i).isEntregado()) {
                logMessage("Serie entregada ", seriesList.get(i).toString());
                seriesEntregadas++;
            }
        }

        for (int i = 0; i < videojuegosList.size(); i++) {
            if (videojuegosList.get(i).isEntregado()) {
                logMessage("Videojuego entregado ", videojuegosList.get(i).toString());
                videojuegosEntregados++;
            }
        }

        logMessage("La cantidad de series entregadas es de:", String.valueOf(seriesEntregadas));
        logMessage("La cantidad de videojuegos entregadas es de:", String.valueOf(videojuegosEntregados));
        logMessage("La cantidad total de series y videojuegos entregadas es de:", String.valueOf(seriesEntregadas + videojuegosEntregados));
    }

    /**
     * [llena la lista de SeriesList].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void crearSeriesList() {
        seriesList.add(new Serie());
        seriesList.add(new Serie("sabrina", "Fantasia oscura"));
        seriesList.add(new Serie("Vikings", "Acción", 6, "Michael Hirst"));
        seriesList.add(new Serie("Halo", "Ciencia ficción ", 1, "Paramon +"));
        seriesList.add(new Serie("The good doctor", "Drama médico", 5, "David Shore"));
    }
    /**
     * [llena la lista de videojuegonList].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void crearVideojuegosList() {
        videojuegosList.add(new Videojuego("GTA", 150));
        videojuegosList.add(new Videojuego("MARIO BROS  ", 50));
        videojuegosList.add(new Videojuego("Street Fighter", 20));
        videojuegosList.add(new Videojuego("need for speed most wanted", 40, "Acción", "Electronic Arts"));
        videojuegosList.add(new Videojuego("dragon ball z shin budokai", 30, "Acción", "Dimps"));
    }

}
