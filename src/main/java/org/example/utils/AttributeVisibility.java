package org.example.utils;

public enum AttributeVisibility {

        PUBLIC("+"),
        PRIVATE("-"),
        PROTECTED("#"),
        PACKAGE("~");

        private final String symbol;

        AttributeVisibility(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

}
