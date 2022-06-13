package org.sofka.punto17;

/**
 * [Clase Televicion crea un objeto de tipo TV]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class Television extends Electrodomestico {

    private int resolucion;

    private Boolean sintonisadorTDT;

    protected static final int RESOLUCION_DEFAUL = 20;

    protected static final Boolean SINTONISADOR_TDT_DEFAULT = false;


    /**
     * [Constructor por defecto]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAUL;
        this.sintonisadorTDT = SINTONISADOR_TDT_DEFAULT;
    }

    /**
     * [Constructor con precio y peso]
     *
     * @param precioBase elemento de tipo (Double)
     * @param peso       elemento de tipo (int)
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Television(Double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFAUL;
        this.sintonisadorTDT = SINTONISADOR_TDT_DEFAULT;
    }

    /**
     * [Constructor completo]
     * Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
     *
     * @param precioBase        Double
     * @param color             String
     * @param consumoEnergetico Character
     * @param peso              Integer
     * @param resolucion        Integer
     * @param sintonisadorTDT   Boolean
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Television(Double precioBase, String color, Character consumoEnergetico, Integer peso, Integer resolucion, Boolean sintonisadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonisadorTDT = sintonisadorTDT;
    }

    /**
     * [Método para calcular el precio final].
     * @return Double
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    @Override
    public Double precioFinal() {
      Double precioFinal = super.precioFinal();

        if( this.getResolucion() > 40 ){
            precioFinal=  (precioFinal * 0.3) + precioFinal;
        }
        if(this.sintonisadorTDT){
            precioFinal += 50.0;
        }
        return precioFinal;
    }

    //getters
    public int getResolucion() {
        return resolucion;
    }

    public Boolean getSintonisadorTDT() {
        return sintonisadorTDT;
    }
}
