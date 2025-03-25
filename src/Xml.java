package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Xml {

    public static ArrayList<HashMap<String, Integer>> LecturaFicheroXML(File fileXML, File salida) {
        ArrayList<HashMap<String, Integer>> listaInfoFichero = new ArrayList<HashMap<String, Integer>>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileXML))) {
            String linea;
            linea = br.readLine();
            linea = br.readLine();
            String objeto = linea;
            while ((linea = br.readLine()) != null) {
                if (linea.equals(objeto)) {
                    HashMap<String, Integer> infoFichero = new HashMap<String, Integer>();
                    String[] palabras = linea.split("<[^>]+>");
                    for (int i = 0; i < palabras.length; i++) {
                        infoFichero.put(palabras[i], i);
                    }
                    listaInfoFichero.add(infoFichero);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el fichero");
        }

        return listaInfoFichero;
    }
}
