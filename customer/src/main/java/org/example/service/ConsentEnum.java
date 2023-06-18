package org.example.service;


public enum ConsentEnum {
    TEXT(0), MAIL(1), POST(2);

    private final int value;
    public int getValue() {
        return value;
    }
    private ConsentEnum(int value) {
        this.value = value;
    }

    public ConsentEnum getKey() {
        return this.getKey();
    }
}
