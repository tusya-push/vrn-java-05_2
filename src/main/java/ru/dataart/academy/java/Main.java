package ru.dataart.academy.java;

import ru.dataart.academy.java.exceptions.OutOfIntRangeException;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // class org.apache.commons.math.exception.OutOfRangeException may be useful

        Stream.of(-456, Integer.MIN_VALUE, Integer.MAX_VALUE)
                .forEach(it -> {
                    try {
                        int reverse = ReverseInteger.reverse(it);
                        System.out.println("Reverse integer works: " + reverse);
                    } catch (OutOfIntRangeException ex) {
                        System.out.println(ex.getMessage());
                    }
                });

    }

}