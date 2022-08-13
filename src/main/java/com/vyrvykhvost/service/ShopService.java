package com.vyrvykhvost.service;

import com.vyrvykhvost.exception.NewException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopService {
    private static final Random RANDOM = new Random();
    public static Logger loggerForFile = LoggerFactory.getLogger(ShopService.class);

    public List<String> readProductsFromFile(String file) throws Exception {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(file);
        try (Stream<String> lineStream = Files.lines(path)) {
            lines = lineStream.collect(Collectors.toList());
        } catch (IOException ignored) {
        }
        return lines;
    }

    public List<String> getListOfOrder(String file) throws Exception {
        List<String> order = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            order.add(readProductsFromFile(file).get(RANDOM.nextInt(readProductsFromFile(file).size())));
        }
        loggingToFile(order);
        if (!isListTrueFormat(order)) {
            throw new NewException();
        } else
            return order;
    }

    public void loggingToFile(List<String> list) {
        for (String elements : list) {
            loggerForFile.info(elements);
        }
    }

    public boolean isFormatTrue(String s) {
        String regex = "(^[a-zA-z]+)\\,[A-Z]+\\-[0-9]{0,3}\\,[a-zA-Z]+\\,[a-z0-9]+\\,[A-Z]+\\,[a-zA-Z]+\\,[0-9]{1,4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            return true;
        }
        return false;
    }

    public boolean isListTrueFormat(List<String> list) {
        for (String elem : list) {
            if (isFormatTrue(elem) == false) {
                return false;
            }
        }
        return true;
    }

}

