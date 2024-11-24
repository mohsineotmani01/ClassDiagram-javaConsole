package org.example.utils;

public enum RelationType {
    DEPENDENCY("..>", "Dépendance"),
    ASSOCIATION("-->", "Association"),
    AGGREGATION("--o", "Agrégation"),
    COMPOSITION("--*", "Composition"),
    INHERITANCE("--|>", "Héritage"),
    IMPLEMENTATION("..|>", "Implémentation"),
    BIDIRECTIONAL("<-->", "Association bidirectionnelle"),
    MANY_TO_MANY("\"*\"--\"*\"", "Plusieurs à plusieurs"),
    ONE_TO_MANY("\"1\"--\"*\"", "Un à plusieurs"),
    MANY_TO_ONE("\"*\"--\"1\"", "Plusieurs à un"),
    ONE_TO_ONE("\"1\"--\"1\"", "Un à un");

    private final String symbol;
    private final String description;

    RelationType(String symbol, String description) {
        this.symbol = symbol;
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDescription() {
        return description;
    }
}
