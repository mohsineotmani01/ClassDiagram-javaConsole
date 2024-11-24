package org.example.utils;

public class AttributeHandler {
    private String name;
    private DataType type;
    private AttributeVisibility visibility;

    // Constructeur
    public AttributeHandler(String name, DataType type, AttributeVisibility visibility) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'attribut ne peut pas être null ou vide");
        }
        if (type == null) {
            throw new IllegalArgumentException("Le type de l'attribut ne peut pas être null");
        }
        if (visibility == null) {
            throw new IllegalArgumentException("La visibilité de l'attribut ne peut pas être null");
        }

        this.name = name;
        this.type = type;
        this.visibility = visibility;
    }

    // Getters
    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    public AttributeVisibility getVisibility() {
        return visibility;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'attribut ne peut pas être null ou vide");
        }
        this.name = name;
    }

    public void setType(DataType type) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de l'attribut ne peut pas être null");
        }
        this.type = type;
    }

    public void setVisibility(AttributeVisibility visibility) {
        if (visibility == null) {
            throw new IllegalArgumentException("La visibilité de l'attribut ne peut pas être null");
        }
        this.visibility = visibility;
    }

    // Méthode de conversion en chaîne UML
    public String toUMLString() {
        return String.format("%s %s: %s",
                visibility.getSymbol(),
                name,
                type.getTypeName());
    }

    // Méthode de comparaison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AttributeHandler that = (AttributeHandler) obj;
        return name.equals(that.name) && type == that.type && visibility == that.visibility;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + visibility.hashCode();
        return result;
    }

    // Méthode toString pour le débogage
    @Override
    public String toString() {
        return String.format("AttributeHandler{name='%s', type=%s, visibility=%s}",
                name, type.getTypeName(), visibility);
    }
}
