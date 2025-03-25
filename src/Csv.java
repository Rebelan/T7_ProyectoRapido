package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Csv {
    
    public static ArrayList<HashMap<String, Integer>> LecturaFicheroCSV(File ficheroCSV, File salida){

        HashMap <String, Integer> infoFichero = new HashMap<String, Integer>();
        ArrayList<HashMap<String, Integer>> listaInfoFichero = new ArrayList<HashMap<String, Integer>>();
        try (BufferedReader br = new BufferedReader(new FileReader(ficheroCSV));
             BufferedWriter bw = new BufferedWriter(new FileWriter(salida))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(",");
                for (int i = 0; i < palabras.length; i++) {
                    infoFichero.put(palabras[i], i);
                }
                listaInfoFichero.add(infoFichero);
                bw.write(infoFichero.toString());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }


        return listaInfoFichero;
    }
}
