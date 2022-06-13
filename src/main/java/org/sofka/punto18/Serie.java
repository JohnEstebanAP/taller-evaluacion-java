package org.sofka.punto18;

/**
 * [Clase Serie]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class Serie {
    private String titulo;
    private int temporada;
    private boolean entregado;
    private String genero;
    private String categoria;

    private final int TEMPORADA_DEFAULT = 3;
    private final boolean ENTREGADO_DEFAULT = false;

    /**
     * [Constructor por defecto]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Serie() {
        this.titulo = "";
        this.temporada = TEMPORADA_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = "";
        this.categoria = "";
    }

    /**
     * [Constructor con titulo y generó].
     *
     * @param titulo elemento de tipo (String)
     * @param genero elemento de tipo (String)
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Serie(String titulo, String genero) {
        this.titulo = titulo;
        this.temporada = TEMPORADA_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = genero;
        this.categoria = "";
    }

    /**
     * [Constructor completo excepto el atributo entregado].
     *
     * @param titulo    String
     * @param genero    String
     * @param temporada int
     * @param categoria String
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Serie(String titulo, String genero, int temporada, String categoria) {
        this.titulo = titulo;
        this.temporada = temporada;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = genero;
        this.categoria = categoria;
    }

    /**
     * [Sobre escritura del método toString].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    @Override
    public String toString() {
        return "Titulo: %s%nCreador: %s%nTemporadas: %s%nCategoría: %s%nEntregada: %s".formatted(titulo, genero, temporada, categoria, entregado);
    }

    /*
        @Override
        public void rent() {
            this.entregado = true;
        }

        @Override
        public void returnRental() {
            this.entregado = false;

        }

        @Override
        public boolean isRent() {
            return this.entregado;
        }

        @Override
        public int compareTo(Object a) {
            Serie serie = (Serie) a;
            int compare = 1;
            if (this.temporada == serie.getTemporada()) {
                compare = 2;
            } else if (this.temporada > serie.getTemporada()) {
                compare = 3;
            }

            return compare;
        }

    */
    //setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
