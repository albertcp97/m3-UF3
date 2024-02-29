package vista;

import java.util.ArrayList;

public class Sortida {

    //mètode sobrecarregat
    public static void imprimir(ArrayList<String> llistaLlibres) {

        String[] campsLlibre;

        if (llistaLlibres.isEmpty()) {
            System.out.println("No hi ha cap llibre per mostrar");
        } else {
            System.out.println("***");

            // per cada element de tipus String, al que li direm llibre, que 
            // hi hagi a l'arrayList llistaLlibres
            for (String llibre : llistaLlibres) {

                campsLlibre = llibre.split(";"); //Array de camps del llibre actual

                System.out.println("ISNB: " + campsLlibre[0]);
                System.out.println("TÍTOL: " + campsLlibre[1]);
                System.out.println("AUTOR: " + campsLlibre[2]);
                System.out.println("ANY EDICIÓ: " + campsLlibre[3]);

                System.out.println("***");
            }
        }
    }

    public static void imprimir(String llibre) {    //mètode sobrecarregat

        String[] campsLlibre;

        if (llibre.length() > 0) {
            campsLlibre = llibre.split(";"); //Array de camps del llibre actual

            System.out.println("***");

            System.out.println("ISNB: " + campsLlibre[0]);
            System.out.println("TÍTOL: " + campsLlibre[1]);
            System.out.println("AUTOR: " + campsLlibre[2]);
            System.out.println("ANY EDICIÓ: " + campsLlibre[3]);

            System.out.println("***");
        } else {
            imprimirText("No hi ha dades per a aquesta cerca");
        }
    }

    public static void imprimirText(String text) {
        System.out.println("***");
        System.out.println(text);
        System.out.println("***");
    }
}
