package src;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Csv {

    public static ArrayList<HashMap<String, Integer>> LecturaFicheroCSV(File ficheroCSV) {

        ArrayList<HashMap<String, Integer>> listaInfoFichero = new ArrayList<HashMap<String, Integer>>();
        try (BufferedReader br = new BufferedReader(new FileReader(ficheroCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                HashMap<String, Integer> infoFichero = new HashMap<String, Integer>();
                String[] palabras = linea.split(",");
                for (int i = 0; i < palabras.length; i++) {
                    infoFichero.put(palabras[i], i);
                }
                listaInfoFichero.add(infoFichero);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaInfoFichero;
    }
}
