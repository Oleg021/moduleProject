package com.vyrvykhvost;

import com.vyrvykhvost.model.Customer;
import com.vyrvykhvost.service.PersonService;
import com.vyrvykhvost.service.ShopService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final PersonService PERSON_SERVICE = new PersonService();
    private static final ShopService SHOP_SERVICE = new ShopService();
    private static final Logger LOG = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        /*List<Customer> customers = new ArrayList<>();
        customers.add(PERSON_SERVICE.creatCustomer());
        customers.add(PERSON_SERVICE.creatCustomer());
        customers.add(PERSON_SERVICE.creatCustomer());
        for (Customer elem : customers) {
            System.out.println(elem);
        }*/
        List<String> list = SHOP_SERVICE.getListOfOrder("E:\\JavaCMD\\moduleProject\\src\\main\\java\\com\\vyrvykhvost\\modul.csv");
        System.out.println(" ");
        for (String elem : list) {
            LOG.info(elem);
        }
    }



}
