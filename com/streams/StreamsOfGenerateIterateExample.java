package com.streams;

import java.awt.*;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> stringStream  = Stream.of("adam", "dan", "julie");
        stringStream.forEach(System.out::println);
        System.out.println("iterate: ");
        Stream.iterate(1,x-> x*2)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("generateStream: ");
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
