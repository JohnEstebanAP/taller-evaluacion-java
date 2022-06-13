package org.sofka.punto18;

/**
 * [Clase Lavadora que extiende de electrodoméstico]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class Videojuego implements Entregable {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    private final int HORAS_ESTIMADAS_DEFAULT = 10;
    private final boolean ENTREGADO_DEFAULT = false;

    /**
     * [Constructor por defecto]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Videojuego() {
        this.titulo = "";
        this.genero = "";
        this.compania = "";
        this.horasEstimadas = HORAS_ESTIMADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
    }

    /**
     * [Constructor con titulo y horasEstimadas].
     *
     * @param titulo         elemento de tipo (String)
     * @param horasEstimadas elemento de tipo (String)
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "";
        this.compania = "";
        this.entregado = ENTREGADO_DEFAULT;
    }

    /**
     * [Constructor completo excepto el atributo entregado].
     *
     * @param titulo         String
     * @param horasEstimadas int
     * @param genero         String
     * @param compania       String
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = ENTREGADO_DEFAULT;
    }

    /**
     * [Sobre escritura del método toString].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    @Override
    public String toString() {
        return "Titulo: %s%nHoras de juego: %s%nGenero: %s%nEntregado: %s %nCompañía: %s".formatted(titulo,
                horasEstimadas, genero, entregado, compania);
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego videojuegos = (Videojuego) a;
        int compare = 0;
        if(this.horasEstimadas >= videojuegos.getHorasEstimadas()) {
            compare = 1;
        }
        return compare;

    }

    //setters y getters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

}
