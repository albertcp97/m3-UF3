package vista;

import java.util.Scanner;

public class Entrada {

    public static String demanarLiniaText(String pregunta) {
        Scanner in = new Scanner(System.in);

        System.out.println(pregunta);
        return in.nextLine();
    }

    public static String demanarIsbn(String pregunta) {
        String isbn = "";
        Scanner lector = new Scanner(System.in);
        System.out.println(pregunta);

        // Guardo a isbn, la paraula llegida. N'obtinc la longitud. Mentre sigui
        // diferent de 13, fer: print no vàlid i torna a començar
        while ((isbn = lector.next()).length() != 13) {
            System.out.println("ISBN no vàlid. Torna a escriure'l");
        }

        return isbn;
    }

    public static String demanarDadesLlibre() {
        String llibre = "";

        llibre += demanarLiniaText("Introduir títol: ").toUpperCase() + ";";
        llibre += demanarLiniaText("Introduir autor: ").toUpperCase() + ";";
        llibre += demanarEnterPositiu("Introduir any d'edició:") + ";";

        return llibre;

    }

    public static int demanarEnterPositiu(String info) {
        Scanner lector = new Scanner(System.in);
        boolean validat = false;
        int enter = -1;
        
        System.out.println(info);

        do {
            if (!lector.hasNextInt()) {
                lector.next();
                System.out.println("El valor ha de ser un número.");

            } else {
                enter = lector.nextInt();
                if (enter > 0) {
                    validat = true;
                } else {
                    System.out.println("El valor ha de ser positiu.");
                }
            }
        } while (!validat);
        
        return enter;
    }
}
