package com.vyrvykhvost.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Telephone extends Product {
    private String model;

    public Telephone(String series, String model, ScreenType screenType, double price) {
        super(series, screenType, price);
        this.model = model;
    }


    public String toString() {
        return "Telephone{" +
                "series = " + series +
                ", model = " + model +
                ", screen type = " + screenType +
                ", price = " + price +
                "}";

    }
}
