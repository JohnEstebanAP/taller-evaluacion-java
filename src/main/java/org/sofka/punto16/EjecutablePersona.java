package org.sofka.punto16;

import org.sofka.utilities.Start;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 * [Clase que Crea la instancia del objeto persona].
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class EjecutablePersona extends Start {


    /**
     * [Método para ejecutar la creación del objeto de persona].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    @Override
    public void start() {

        List<Persona> personas = new ArrayList<>();
        String nombre;
        int edad;
        String sexo;
        Double peso;
        Double altura;

        Scanner scanner = new Scanner(System.in);

        logMessage("se creara un objeto de persona \npor favor ingresar los siguientes datos: ", "");
        log("Nombre de la persona: ");
        nombre = scanner.nextLine();
        log("Edad de la persona: ");
        edad = validarDatoInt();
        log("sexo de la persona ingresar (H) para hombre o  (M) para las mujeres: ");
        sexo = scanner.nextLine();
        log("Peso de la persona: ");
        peso = validarDatoDouble();
        log("Altura dela persona: ");
        altura = validarDatoDouble();

        //Creación del primer objeto de persona
        personas.add(new Persona(nombre, edad, sexo, peso, altura));


        logMessage("se creara un segundo objeto de persona", "\npor favor ingresar los siguientes datos: ");
        log("Peso persona 2:");
        peso = validarDatoDouble();
        log("Altura persona 2:");
        altura = validarDatoDouble();

        personas.get(1).setPeso(peso);
        personas.get(1).setAltura(altura);

        //Creación del segundo objeto de persona
        personas.add(new Persona(nombre, edad, sexo));


        logMessage("se creara un tercer objeto de persona", "\npor favor ingresar los siguientes datos: ");
        log("Nombre de la Persona 3:");
        nombre = scanner.nextLine();
        log("Edad de la Persona 3:");
        edad = validarDatoInt();
        log("sexo de la persona 3, ingresar (H) para hombre o  (M) para las mujeres: ");
        sexo = scanner.nextLine();
        log("Peso de la persona 3: ");
        peso = validarDatoDouble();
        log("Altura dela persona 3: ");
        altura = validarDatoDouble();

        personas.get(2).setNombre(nombre);
        personas.get(2).setEdad(edad);
        personas.get(2).setSexo(sexo);
        personas.get(2).setPeso(peso);
        personas.get(2).setAltura(altura);

        //Creación del tercer objeto de persona
        personas.add(new Persona());

        infoPersonas(personas);
    }

    public static Double validarDatoDouble() {
        Scanner scanner = new Scanner(System.in);

        Double num;
        try {
            num = scanner.nextDouble();
        } catch (InputMismatchException e) {
            log("Por favor ingrese el numero de manera de manera correcta, ejemplo (5,2)");
            num = validarDatoDouble();
        }
        return num;
    }

    public static int validarDatoInt() {
        Scanner scanner = new Scanner(System.in);

        int num;
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            log("Por favor ingrese el numero de manera de manera correcta, ejemplo (19)");
            num = validarDatoInt();
        }
        return num;
    }

    /**
     * [Método imprimir en consola toda la información de la persona].
     *
     * @param personas elemento de tipo (List<Persona>) que contiene una lista de personas.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void infoPersonas(List<Persona> personas) {
        for (int i = 0; i < 3; i++) {
            printIMC(personas.get(i).calcularIMC());
            printIsMayarEdad(personas.get(i).esMayorDeEdad());
            log(personas.get(i).toString());
        }
    }

    /**
     * [Método imprimir en consola el sí la persona es mayor de edad o no].
     *
     * @param mayorEdad elemento de tipo (Boolean).
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void printIsMayarEdad(boolean mayorEdad) {
        if (mayorEdad) {
            log("Es Mayor de edad");
        } else {
            log("Es menor de Edad");
        }
    }


    /**
     * [Método imprimir en consola el estado del IMC de la persona].
     *
     * @param imc elemento de tipo (int) que contiene el imc Calcolado.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since Esta presente desde la version 1.0.0
     */
    private void printIMC(int imc) {
        switch (imc) {
            case -1 -> log("Está por debajo de su peso ideal");
            case 0 -> log("Está en su peso ideal");
            case 1 -> log("Tiene sobrepeso");
            case 2 -> log("IMC fuera de Rango");
            default -> log("IMC no detectado");
        }
    }
}
