package org.sofka.software.ejercicio12;

import org.sofka.software.MyPrintAbstract;

import java.util.Scanner;

public class CompararParabras extends MyPrintAbstract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String messageMenu = """
                ********************Comparación de palabras******************
                toma dos palabras y las campara diciendo si son iguales 
                o sus diferencias""";
        log(messageMenu);
        log("por favor ingrese la palabra 1:");
        String palabra1 = scanner.nextLine();
        palabra1 = palabra1.toLowerCase().replaceAll("\\s","");
        log("por favor ingrese la palabra 2:");
        String palabra2 = scanner.nextLine();
        palabra2 = palabra2.toLowerCase().replaceAll("\\s","");

        if(palabra1.equals(palabra2)){
            log("Las palabras son iguales");
        }else {
            makeLog("\nLas palabras son diferentes \npues la palabra 1 tiene: {0} letras,\ny la palabra 2 tiene: {1} letras \nTienen una diferencia de {2} letras ", new Object[]{palabra1.length(), palabra2.length(), Math.abs(palabra1.length() - palabra2.length())});
        }

    }
}
