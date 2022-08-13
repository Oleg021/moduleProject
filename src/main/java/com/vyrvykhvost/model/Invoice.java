package com.vyrvykhvost.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Invoice {
    private List<Product> productList;
    private Customer customer;
    private String type;
    private Date time;


    public Invoice(List<Product> productList, Customer customer, String type) {
        this.productList = productList;
        this.customer = customer;
        this.type = type;
        this.time = Calendar.getInstance().getTime();
    }
}
