package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Json {

    public static ArrayList<HashMap<String, Integer>> LecturaFicheroJSON(File fileJSON) {
        ArrayList<HashMap<String, Integer>> listaInfoFichero = new ArrayList<HashMap<String, Integer>>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileJSON))) {
            String linea;
            linea = br.readLine();
            linea = br.readLine();
            String objeto = linea;
            HashMap<String, Integer> infoFichero = new HashMap<String, Integer>();
            do {
                if (linea.equals(objeto)) {
                    infoFichero = new HashMap<String, Integer>();
                }
                if (!linea.equals("},")) {
                    String[] palabras = linea.split("");
                    for (int i = 0; i < palabras.length; i++) {
                        infoFichero.put(palabras[i], i);
                    }
                } else
                    listaInfoFichero.add(infoFichero);
            } while ((linea = br.readLine()) != null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
