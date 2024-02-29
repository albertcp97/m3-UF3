package pkg_main;

import acces_fitxers.GestorLlibreria;
import vista.Sortida;
import vista.Entrada;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("** Programa de gestió de la llibreria **");

        GestorLlibreria miLlibreria = new GestorLlibreria();
        ArrayList<String> llistaLlibres;
        String llibre;

        miLlibreria.crearFitxerSiNoExiste();

        boolean sortir = false;
        do {
            switch (miLlibreria.triarAccio()) {
                case "1":
                    llistaLlibres = miLlibreria.getLlistaLlibres();
                    //Mostrem el llistat de llibres
                    Sortida.imprimir(llistaLlibres);
                    break;
                case "2":
                    llibre = miLlibreria.buscarLlibre(
                            Entrada.demanarIsbn("Introduir ISBN:"));
                    Sortida.imprimir(llibre);
                    break;
                    
                case "3":
                    miLlibreria.inserirLlibre();
                    break;
                case "4":
                    sortir = true;
                    break;
                default:
                    Sortida.imprimirText("Opció no vàlida");
            }

        } while (!sortir);
    }

}
