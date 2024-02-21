/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Albert
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        
        
        File carpeta = new File("C:\\Users\\Albert\\Desktop\\ejercicio_ficheros");
        
        carpeta.mkdir();
        //C:\Users\Albert\Desktop\ficheros_java+"\\file.txt"
        System.err.println("Ruta a la pinche carpeta: "+carpeta.getAbsoluteFile());
        File carpetaA= new File(carpeta.getAbsoluteFile()+"\\a");
        File carpetaB= new File(carpeta.getAbsoluteFile()+"\\b");
        File carpetaC= new File(carpeta.getAbsoluteFile()+"\\c");        
        carpetaC.mkdir();   
        carpetaA.mkdir();
        carpetaB.mkdir();     
        
        File ficher= new File(carpetaA.getAbsolutePath()+"\\file.txt");
        
        if(!ficher.exists()){
            try {
                ficher.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Error");    
            }
            
        }
       
        showCarpetsAndFiles(carpeta);
        
        File fileConazo= new File(carpetaB+"\\file.txt");
        ficher.renameTo(fileConazo);
        System.out.println("");
        showCarpetsAndFiles(carpeta);
        
        File fileConazo2= new  File(carpetaC+"\\file.txt");
        
        fileConazo.renameTo(fileConazo2);
         System.out.println("");
        showCarpetsAndFiles(carpeta);
        
        File ficheroFinal= new File(carpetaC+"\\ficherFinal.txt");
        fileConazo2.renameTo(ficheroFinal);
        
         
         System.out.println("");
        showCarpetsAndFiles(carpeta);
//        for(int i=0; i<carpeta.list().length;i++)
//        {
//            System.out.println(carpeta.list()[i]);
//        }
//        
//        
        
//        try ( FileWriter fw= new FileWriter(ficher,true)){
//               
//           
//                fw.write("Hola\n");
//                fw.flush();
//                fw.close();
//                System.out.println(ficher.getAbsoluteFile());
//                 Scanner sc = new Scanner(ficher);
//             while (sc.hasNextLine()) {
//            
//                 System.out.println(sc.nextLine());
//            
//            }
//                
//            } catch (IOException ex) {
//                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
//            }
       
//      try {
//            Scanner sc = new Scanner(ficher2);
//             while (sc.hasNextLine()) {
//            
//                 System.out.println(sc.nextLine());
//            
//            }
//             
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public static void showCarpetsAndFiles(File absoleteCarpet){
           for(String s : absoleteCarpet.list()){
            File file_aux= new File(absoleteCarpet.getAbsolutePath()+"\\"+s);
            System.out.println("Subcarpeta "+s+":");
            try{
                for(int i=0; i< file_aux.list().length;i++)
                {
                    System.out.println("Subcarpeta "+s+": "+file_aux.list()[i]);
                }
            }catch(Exception e){
                System.err.println("no se puede listar");
            }
        }
    }
    
}


