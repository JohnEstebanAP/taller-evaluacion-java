package org.sofka.punto17;


/**
 * [Clase facilita la utilidad de imprimir en consola un Menú de opciones]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public abstract class Electrodomestico {

    private Double precioBase;

    private String color;

    private Character consumoEnergetico;

    private int peso;


    //Constante para valores por defecto
    protected static final Double PRECIO = 100.0;
    protected static final String COLORDEFAUL = "blanco";
    protected static final int PESODEFAUL = 5;
    protected static final Character CONSUMOENERGETICODEFAULT = 'F';

    /**
     * [Método constructor por defecto de la clase Electrodomésticos]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Electrodomestico() {
        this.precioBase = PRECIO;
        this.color = COLORDEFAUL;
        this.consumoEnergetico = CONSUMOENERGETICODEFAULT;
        this.peso = PESODEFAUL;
    }


    /**
     * [Método constructor con precio y peso.]
     *
     * @param precioBase elemento de tipo (double).
     * @param peso       elemento de tipo (int).
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Electrodomestico(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLORDEFAUL;
        this.consumoEnergetico = CONSUMOENERGETICODEFAULT;
    }

    /**
     * [Método constructor con todos los atributos.]
     *
     * @param precioBase        elemento de tipo (double).
     * @param peso              elemento de tipo (int).
     * @param color             String
     * @param consumoEnergetico Character
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color.toLowerCase());
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    protected static final Character[] CODES = {'A', 'B', 'C', 'D', 'E', 'F'};

    /**
     * [Método para comprobar el comsumo energetico.]
     *
     * @param ce elemento de tipo (Character) este contiene el comsumo energetico.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private Character comprobarConsumoEnergetico(Character ce) {
        if (CODES[0].equals(ce) || CODES[1].equals(ce) || CODES[2].equals(ce) || CODES[3].equals(ce) || CODES[4].equals(ce) || CODES[5].equals(ce)) {
            return ce;
        }
        return CONSUMOENERGETICODEFAULT;
    }

    protected static final String[] COLORES = {"negro", "rojo", "azul", "gris"};

    /**
     * [Método para comprobar que sea un color correcto o permitido.]
     *
     * @param color elemento de tipo (String).
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private String comprobarColor(String color) {
        if (COLORES[0].equals(color) || COLORES[1].equals(color) || COLORES[2].equals(color) || COLORES[3].equals(color)) {
            return color;
        }
        return COLORDEFAUL;
    }

    /**
     * [Método que calcula el precio final].
     * Se suman los recargos al precio base
     *
     * @return Double
     */
    public Double precioFinal() {
        Double precioFinal = this.precioBase;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal = precioFinal + 100.0;
                break;
            case 'B':
                precioFinal = precioFinal + 80.0;
                break;
            case 'C':
                precioFinal = precioFinal + 60.0;
                break;
            case 'D':
                precioFinal = precioFinal + 50.0;
                break;
            case 'E':
                precioFinal = precioFinal + 30.0;
                break;
            case 'F':
                precioFinal = precioFinal + 10.0;
                break;
            default:
                precioFinal = precioFinal + 0.0;
                break;
        }

        if (peso >= 0 && peso <= 19) {
            precioFinal += 10.0;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 50.0;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 80.0;
        } else if (peso >= 80) {
            precioFinal += 100.0;
        }

        return precioFinal;
    }


    // getters
    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }
}
