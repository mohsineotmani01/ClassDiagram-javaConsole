package org.example.utils;

import java.util.ArrayList;
import java.util.List;

public class MethodHandler {
    private String name;
    private DataType returnType;
    private AttributeVisibility visibility;
    private List<ParameterHandler> parameters;

    public MethodHandler(String name, DataType returnType, AttributeVisibility visibility) {
        this.name = name;
        this.returnType = returnType;
        this.visibility = visibility;
        this.parameters = new ArrayList<>();
    }

    // Getter pour le nom de la méthode
    public String getName() {
        return name;
    }

    // Getter pour la liste des paramètres
    public List<ParameterHandler> getParameters() {
        return parameters;
    }

    public void addParameter(String name, DataType type) {
        parameters.add(new ParameterHandler(name, type));
    }

    public String toUMLString() {
        StringBuilder sb = new StringBuilder();
        sb.append(visibility.getSymbol())
                .append(" ")
                .append(name)
                .append("(");

        for (int i = 0; i < parameters.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(parameters.get(i).toString());
        }

        sb.append("): ")
                .append(returnType.getTypeName());

        return sb.toString();
    }
}
