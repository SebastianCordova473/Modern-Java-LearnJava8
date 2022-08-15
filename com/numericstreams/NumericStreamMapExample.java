package com.numericstreams;

import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    static Supplier<List<Integer>> mapToObj = () -> {
        return IntStream.rangeClosed(1, 5).mapToObj((i) -> {
            return new Integer(i);
        }).collect(toList());
    };

    static LongSupplier mapToLong = () ->
        IntStream.rangeClosed(1,5)//IntStream
                // i passed from the intStream
                .mapToLong((i)->i) //convert IntStream to LongStream
                .sum();
    static DoubleSupplier mapToDouble = () ->
            IntStream.rangeClosed(1,5)
            .mapToDouble((i)->i) //Convert IntStream to DoubleStream
                    .sum();

    public static void main(String[] args) {
        System.out.println(mapToObj.get());
        System.out.println(mapToLong.getAsLong());
        System.out.println(mapToDouble.getAsDouble());
    }
}
