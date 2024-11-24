package org.example.utils;


import java.io.File;
import java.io.IOException;

public class FileUtil {
    // Fonction pour vérifier si le fichier est accessible (pas ouvert par un autre processus)
    public static boolean isFileAvailable(String filePath) {
        File file = new File(filePath);
        try {
            // Tente d'ouvrir un flux en écriture pour voir si le fichier est utilisé
            if (file.exists()) {
                // Si le fichier existe, essayer de le renommer (ce qui échouera s'il est ouvert)
                File tempFile = new File(filePath + ".temp");
                boolean renamed = file.renameTo(tempFile);
                if (renamed) {
                    tempFile.renameTo(file); // Restaure le nom d'origine
                    return true;  // Fichier accessible
                }
                return false;  // Le fichier est utilisé
            }
            return true;  // Le fichier n'existe pas, donc il est disponible
        } catch (Exception e) {
            return false;  // En cas d'exception, on suppose que le fichier est utilisé
        }
    }
}

