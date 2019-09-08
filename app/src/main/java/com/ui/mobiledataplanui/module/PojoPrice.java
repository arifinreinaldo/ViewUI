package com.ui.mobiledataplanui.module;

public class PojoPrice {
    private int price;
    private int nominal;

    public PojoPrice(int price, int nominal) {
        this.price = price;
        this.nominal = nominal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
}
