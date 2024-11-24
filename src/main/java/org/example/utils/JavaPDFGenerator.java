package org.example.utils;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.util.Scanner;

public class JavaPDFGenerator {

    public static void convertImageToPDF(String imagePath, String pdfPath) throws IOException {
        // Demander à l'utilisateur un nom valide de fichier si le fichier est déjà utilisé
        Scanner scanner = new Scanner(System.in);
        while (!FileUtil.isFileAvailable(pdfPath)) {
            System.out.println("Erreur : Le fichier est actuellement utilisé. Veuillez saisir un autre nom de fichier.");
            System.out.print("Saisir un nom valide de votre diagramme : ");
            String nameFile = scanner.nextLine();
            String nameFNotSpace = nameFile.replaceAll("\\s+", "");
            pdfPath = "src/main/resources/outputPdf/" + nameFNotSpace + ".pdf";
        }

        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            PDImageXObject image = PDImageXObject.createFromFile(imagePath, document);
            float scale = Math.min(
                    page.getMediaBox().getWidth() / image.getWidth(),
                    page.getMediaBox().getHeight() / image.getHeight()
            );

            float xPosition = (page.getMediaBox().getWidth() - image.getWidth() * scale) / 2;
            float yPosition = (page.getMediaBox().getHeight() - image.getHeight() * scale) / 2;

            // Ajout de l'image au PDF
            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.drawImage(image, xPosition, yPosition,
                        image.getWidth() * scale, image.getHeight() * scale);

                // Ajouter un titre au document avec newLineAtOffset
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);
                contentStream.newLineAtOffset(100f, page.getMediaBox().getHeight() - 50f); // Position du titre
                contentStream.showText("Diagramme de Classe");
                contentStream.endText();

                // Ajouter un soulignement
                contentStream.setLineWidth(1);
                contentStream.moveTo(100f, page.getMediaBox().getHeight() - 55f); // Position du soulignement
                contentStream.lineTo(300f, page.getMediaBox().getHeight() - 55f); // Longueur du soulignement
                contentStream.stroke();
            }

            // Ajout des métadonnées
            document.getDocumentInformation().setAuthor("Mohsine Otmani");
            document.getDocumentInformation().setTitle("Diagramme de classe");

            // Enregistrement du document PDF
            document.save(pdfPath);
            System.out.println("PDF généré avec succès !");

        } catch (IOException e) {
            System.err.println("Erreur lors de la conversion de l'image en PDF : " + e.getMessage());
            throw e;
        }
    }
}
