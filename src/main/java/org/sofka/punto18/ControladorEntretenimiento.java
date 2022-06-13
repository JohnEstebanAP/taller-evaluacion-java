package org.sofka.punto18;

import org.sofka.utilities.Start;

import java.util.ArrayList;
import java.util.List;

public class ControladorEntretenimiento extends Start {
    List<Serie> seriesList = new ArrayList<>();
    List<Videojuego> videojuegosList = new ArrayList<>();

    @Override
    public void start() {
        crearSeriesList();
        crearVideojuegosList();

        //Entrega algunos Videojuegos y Series con el método entregar().

        //se entregar algunas series
        seriesList.get(1).entregar();
        seriesList.get(2).entregar();
        seriesList.get(3).entregar();

        //se entregar algunas series
        videojuegosList.get(1).entregar();
        videojuegosList.get(2).entregar();

        contarEntregados();

        mayorTiempo();
    }

    private void mayorTiempo() {
        Serie serieHours = new Serie();
        serieHours.setSeasons(0);
        for (Serie gam : seriesList) {
            if (gam.compareTo(serieHours) == 3) serieHours = gam;

        }

        Game gameHours = new Game();
        gameHours.setEstimatedHours(0);
        for (Game gam : gamesList) {
            if (gam.compareTo(gameHours) == 3) gameHours = gam;


        }


        logMessage( "El juego con mas horas es:", gameHours.toString());
        logMessage( "La serie con mas temporadas es:", serieHours.toString());
    }


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

    private void crearSeriesList() {
        seriesList.add(new Serie());
        seriesList.add(new Serie("sabrina", "Fantagia oscura"));
        seriesList.add(new Serie("Vikings", "Acción", 6, "Michael Hirst"));
        seriesList.add(new Serie("Halo", "Ciencia ficción ", 1, "Paramon +"));
        seriesList.add(new Serie("The good doctor", "Drama médico", 5, "David Shore"));

    }

    private void crearVideojuegosList() {
        videojuegosList.add(new Videojuego("GTA", 150));
        videojuegosList.add(new Videojuego("MARIO BROS  ", 50));
        videojuegosList.add(new Videojuego("Street Fighter", 20));
        videojuegosList.add(new Videojuego("need for speed most wanted", 40, "Acción", "Electronic Arts"));
        videojuegosList.add(new Videojuego("dragon ball z shin budokai", 30, "Acción", "Dimps"));
    }


}
