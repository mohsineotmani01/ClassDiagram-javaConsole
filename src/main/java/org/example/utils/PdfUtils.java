package org.example.utils;
/*
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfUtils {

    // Convertit l'image PNG en PDF
    public static void convertImageToPdf(String imagePath, String pdfPath) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
            document.open();
            Image img = Image.getInstance(imagePath);
            img.setAlignment(Image.ALIGN_CENTER);
            img.scaleToFit(500, 500); // Ajuster la taille de l'image si nécessaire
            document.add(img);
            document.close();
            System.out.println("PDF généré avec succès : " + pdfPath);
        } catch (Exception e) {
            System.err.println("Erreur lors de la conversion en PDF : " + e.getMessage());
        }
    }
}
*/