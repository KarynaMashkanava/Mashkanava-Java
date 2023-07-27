package org.example;

public enum Constant {
    DEFAULT_NAME("Вячеслав");
    private final String value;
    Constant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
