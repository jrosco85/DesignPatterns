package com.jrosco;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var listOfCars = List.of("volvo","bmw","merCedes");
        var listOfCarsInLowerCase = listOfCars.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println(listOfCarsInLowerCase);
    }
}