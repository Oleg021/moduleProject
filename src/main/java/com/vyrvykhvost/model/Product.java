package com.vyrvykhvost.model;

import java.util.UUID;

public abstract class Product {
    protected String id;
    protected String series;
    protected ScreenType screenType;
    protected double price;

     Product() {
    }
    public Product(String series, ScreenType screenType, double price) {
        this.id = UUID.randomUUID().toString();
        this.series = series;
        this.screenType = screenType;
        this.price = price;
    }
}
