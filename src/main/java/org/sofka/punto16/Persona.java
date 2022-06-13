package org.sofka.punto16;

import java.util.Random;

/**
 * [Clase que modela a una persona con sus atributos más comunes]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class Persona  {

    private static final String HOMBRE = "H";
    private static final String MUJER = "M";
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private Double peso;
    private Double altura;


    /**
     * [Constructor por defecto de la clase persona]
     * Asigna valores por defecto a los atributos.
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = HOMBRE;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    /**
     * Constructor con los parámetros de nombre, edad sexo, y dni
     * Si el parámetro suministrado para sexo no es balido se asigna por defecto 'H'
     *
     * @param nombre elemento de tipo (String)
     * @param edad   elemento de tipo int
     * @param sexo   elemento de tipo String
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        setSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    /**
     * Constructor con atributos.
     *
     * El atributo DNI es aleatorio.
     * Si el parametro suministrado para sexo no es valido se asigna por defecto 'H'
     *
     * @param nombre String
     * @param edad   Integer
     * @param sexo   Character [H o M]
     * @param peso   Double peso en Kg
     * @param altura Double altura en metros
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Persona(String nombre, int edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        setSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    private static final Integer IMCIDEAL = 0;
    private static final Integer IMCBAJO = -1;
    private static final Integer IMCALTO = 1;

    /**
     * [método que calcula si la persona está en su pesa ideal]
     *
     * IMC < 20 -> -1   peso bajo
     * IMC >= 20 <= 25 -> 0 Normal
     * IMC > 25 -> 1  tiene sobrepeso.
     * @return retorna un entero indicando el IMC
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public int calcularIMC() {

        if (this.altura != 0) {
            int imc = (int) (peso / Math.pow(altura, 2));

            if (imc < 20) {
                return IMCBAJO;
            } else if (imc > 25) {
                return IMCALTO;
            }

            return IMCIDEAL;
        }
        //retorna 2 porque tenemos un error y el peso es 0.
        return 2;
    }

    /**
     * [Método para calcular si es mayor de edad]
     *
     * @return Boolean
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    public Boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    /**
     * [Método para comprobar el sexo de la persona]
     *
     * @return String sexo de la persona.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private String comprobarSexo(String sexo){
        sexo = sexo.toUpperCase();
        if(sexo.equals(HOMBRE) || sexo.equals(MUJER) ){
            return sexo;
        }
        return  HOMBRE;
    }

    /**
     * [Método que devuelve toda la información de la persona.]
     *
     * @return String
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nSexo: " + sexo +
                "\nDNI: " + dni +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

    private final Random claseRandom = new Random(); // Esto crea una instancia de la Clase Random

    /**
     * [Método que genera un número aleatorio de 8 cifras.]
     *
     * @return String
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private String generarDNI(){

        String genDNI = "";
        for(int i=0; i<=7; i++){
            genDNI = genDNI.concat(String.valueOf(claseRandom.nextInt(9))); // Genera un número entre 0 y 9, sin decimales raros ni nada
        }
        return genDNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
