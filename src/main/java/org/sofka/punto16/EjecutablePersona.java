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
        log("Peso de la persona (75,5): ");
        peso = validarDatoDouble();
        log("Altura dela persona (1,78):  ");
        altura = validarDatoDouble();

        //Creación del primer objeto de persona
        personas.add(new Persona(nombre, edad, sexo, peso, altura));


        logMessage("se creara un segundo objeto de persona", "\npor favor ingresar los siguientes datos: ");
        log("sexo de la persona 2 ingresar (H) para hombre o  (M) para las mujeres: ");
        sexo = scanner.nextLine();
        log("Peso persona 2 (75,5): ");
        peso = validarDatoDouble();
        log("Altura persona 2(1,78): ");
        altura = validarDatoDouble();


        //Creación del segundo objeto de persona
        personas.add(new Persona(nombre, edad, sexo));
        personas.get(1).setSexo(sexo);
        personas.get(1).setPeso(peso);
        personas.get(1).setAltura(altura);


        logMessage("se creara un tercer objeto de persona", "\npor favor ingresar los siguientes datos: ");
        log("Nombre de la Persona 3:");
        nombre = scanner.nextLine();
        log("Edad de la Persona 3:");
        edad = validarDatoInt();
        log("sexo de la persona 3, ingresar (H) para hombre o  (M) para las mujeres: ");
        sexo = scanner.nextLine();
        log("Peso de la persona 3 (70,0): ");
        peso = validarDatoDouble();
        log("Altura dela persona 3 (1,70): ");
        altura = validarDatoDouble();

        //Creación del tercer objeto de persona
        personas.add(new Persona());

        personas.get(2).setNombre(nombre);
        personas.get(2).setEdad(edad);
        personas.get(2).setSexo(sexo);
        personas.get(2).setPeso(peso);
        personas.get(2).setAltura(altura);


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
            logMessage("Información de la persona", String.valueOf(i+1));
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
