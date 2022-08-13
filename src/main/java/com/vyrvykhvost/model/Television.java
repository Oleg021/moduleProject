package com.vyrvykhvost.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Television extends Product {
    private double diagonal;
    private Country country;

    public Television(String series, double diagonal, ScreenType screenType, Country country, double price) {
        super(series, screenType, price);
        this.diagonal = diagonal;
        this.country = country;
    }

    public String toString() {
        return "Television: " +
                "series = " + series +
                ", diagonal = " + diagonal +
                ", screen type = " + screenType +
                ", country = " + country +
                ", price = " + price +
                "}";
    }
}
