package org.example.utils;

public class ParameterHandler {
    private String name;
    private DataType type;

    public ParameterHandler(String name, DataType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + ": " + type.getTypeName();
    }
}
