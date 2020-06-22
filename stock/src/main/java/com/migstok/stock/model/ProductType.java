package com.migstok.stock.model;

public enum ProductType {
    PERIPHERAL(1, "Peripheral"),
    EQUIPMENT(2, "Equipment");

    private int idType;
    private String type;


    ProductType(int idType, String type) {
        this.idType = idType;
    }

    public int getIdType() {
        return idType;
    }

    public String getType() {
        return type;
    }
}
