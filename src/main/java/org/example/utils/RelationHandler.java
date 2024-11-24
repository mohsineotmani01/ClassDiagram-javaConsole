package org.example.utils;
public class RelationHandler {
    private String sourceClass;
    private String targetClass;
    private RelationType type;
    private String sourceCardinality;
    private String targetCardinality;
    private String relationLabel;

    // Constructeur
    public RelationHandler(String sourceClass, String targetClass, RelationType type) {
        this.sourceClass = sourceClass;
        this.targetClass = targetClass;
        this.type = type;
    }

    // Méthode pour obtenir la classe source
    public String getSourceClass() {
        return sourceClass;
    }

    // Méthode pour obtenir la classe cible
    public String getTargetClass() {
        return targetClass;
    }

    // Autres méthodes...

    public void setCardinalities(String sourceCardinality, String targetCardinality) {
        this.sourceCardinality = sourceCardinality;
        this.targetCardinality = targetCardinality;
    }

    public void setRelationLabel(String label) {
        this.relationLabel = label;
    }

    public String toUMLString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sourceClass);

        // Ajouter la cardinalité source si elle existe
        if (sourceCardinality != null && !sourceCardinality.isEmpty()) {
            sb.append(" \"").append(sourceCardinality).append("\"");
        }

        // Ajouter le type de relation
        sb.append(" ").append(type.getSymbol()).append(" ");

        // Ajouter la cardinalité cible si elle existe
        if (targetCardinality != null && !targetCardinality.isEmpty()) {
            sb.append("\"").append(targetCardinality).append("\" ");
        }

        sb.append(targetClass);

        // Ajouter le label si il existe
        if (relationLabel != null && !relationLabel.isEmpty()) {
            sb.append(" : ").append(relationLabel);
        }

        return sb.toString();
    }
}
