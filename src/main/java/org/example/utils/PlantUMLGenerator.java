package org.example.utils;

import net.sourceforge.plantuml.SourceStringReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class PlantUMLGenerator {
    public static void generateUMLImage(String umlContent, String outputPath) throws IOException {
        String plantUmlContent = "@startuml\n" +
                "skinparam classAttributeIconSize 0\n" +
                umlContent + "\n" +
                "@enduml";

        SourceStringReader reader = new SourceStringReader(plantUmlContent);
        try (FileOutputStream output = new FileOutputStream(outputPath)) {
            reader.outputImage(output);
        } catch (IOException e) {
            System.err.println("Erreur lors de la génération de l'image UML : " + e.getMessage());
            throw e; // Relancer l'exception après log
        }
    }

}

