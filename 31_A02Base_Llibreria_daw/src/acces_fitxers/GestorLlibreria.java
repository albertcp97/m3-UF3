package acces_fitxers;

import vista.Sortida;
import vista.Entrada;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorLlibreria {
    
    //atributs d'instància File per al directori i el fitxer

    
    public void crearFitxerSiNoExiste() {

    }

    public String triarAccio() {

        return Entrada.demanarLiniaText(
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\nIntrodueix l'opció desitjada: \n"
                + "	1. Llistar tots els llibres \n"
                + "	2. Buscar llibre a partir de l'ISBN\n"
                + "	3. Inserir un nou llibre\n"
                + "	4. Sortir");
    }

    public ArrayList<String> getLlistaLlibres() {
        ArrayList <String> libros= new ArrayList<>();
        try {
            
            File f= new File("lunaDePluton.txt");
            mirarSiExiste(f);
            Scanner sc = new Scanner(f);
            
            while(sc.hasNextLine()){
                String linea= sc.nextLine();
                libros.add(linea);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorLlibreria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return libros;
    }

    public String buscarLlibre(String isbn) {
        
     return null;
    }

    public void inserirLlibre() {
        FileWriter fw= null;

            File f= new File("lunaDePluton.txt");
            mirarSiExiste(f);
        try {
            fw = new FileWriter(f,true);
        } catch (IOException ex) {
            Logger.getLogger(GestorLlibreria.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            String libro = Entrada.demanarIsbn("PON EL ISBN DEL LIBRO:")+";";
            
            libro+=Entrada.demanarDadesLlibre();
            
        try {
            fw.write(libro);
        } catch (IOException ex) {
            Logger.getLogger(GestorLlibreria.class.getName()).log(Level.SEVERE, null, ex);
        }
            
     
    }
    
    public void mirarSiExiste(File f){
          try {
            
            
            if(!f.exists())
                f.createNewFile();
           
        } catch (IOException ex) {
            Logger.getLogger(GestorLlibreria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
