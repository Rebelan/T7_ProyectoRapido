package src;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.classfile.BufWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Xml {
    
    public static ArrayList<HashMap<String, Integer>> LecturaFicheroXML(File fileXML, File salida){
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileXML));
            BufferedWriter bw = new BufferedWriter(new FileWriter(salida))){
            String linea;
            while ((linea = br.readLine()) != null){
                String[] palabras = linea.split(" ");
                
            }
        }catch(Exception e){
            System.out.println("Error al leer el fichero");
        }
        
        return null;
    }
}
