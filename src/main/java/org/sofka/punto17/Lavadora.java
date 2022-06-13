package org.sofka.punto17;


/**
 * [Clase Lavadora que extiende de electrodoméstico]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class Lavadora extends Electrodomestico{

    private int carga;

    protected static final int CARGADEFAULT = 5;

    /**
     * [Constructor por defecto]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Lavadora(){
        super();
        this.carga = CARGADEFAULT;
    }

    /**
     * [Constructor con precio y peso].
     *
     * @param precioBase elemento de tipo (Double)
     * @param peso elemento de tipo (Double)
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Lavadora(Double precioBase, int peso){
        super(precioBase,peso);
        this.carga =CARGADEFAULT;
    }

    /**
     * [Constructor completo].
     *
     * @param precioBase Double
     * @param color String
     * @param consumoEnergetico Character
     * @param peso Integer
     * @param carga Integer
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    public Lavadora(Double precioBase, String color, Character consumoEnergetico, int peso, int carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }


    /**
     * [Método para calcular el precio final].
     * @return Double
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0*
     */
    @Override
    public Double precioFinal() {
        if(carga > 30 ){
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }


    //getters

    public int getCarga() {
        return carga;
    }
}
