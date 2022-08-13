package com.vyrvykhvost.service;

import com.vyrvykhvost.model.Customer;

import java.util.Random;

public class PersonService {
    private Customer customer;
    protected static final Random RANDOM = new Random();

    public Customer creatCustomer() {
        return  new Customer(
                generateRandomEmailAddress("gmail.com"),
                RANDOM.nextInt(80)
        );
    }

    public static String generateRandomEmailAddress(String domain) {
        String emailAddress = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (emailAddress.length() < 5) {
            int character = (int) (Math.random() * 26);
            emailAddress += alphabet.substring(character, character + 1);
        }
        emailAddress += Integer.valueOf((int) (Math.random() * 99))
                .toString();
        emailAddress += "@" + domain;
        return emailAddress;
    }
}
