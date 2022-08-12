package com.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class NumericStreamExample {

    static Function<List<Integer>, Optional<Integer>>
            sumOfNumber = integers -> integers.stream()
                    .reduce((x,y) -> x + y);

    static IntSupplier sumOfNumberInStream = () ->
            IntStream.rangeClosed(1,6)
            .sum();

    public static void main(String[] args) {
      List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
      System.out.println("Sum of N Numbers: " + sumOfNumber.apply(integerList).orElse(0));
      System.out.println("Sum of N Numbers using IntStream: " + sumOfNumberInStream.getAsInt());

    }
}
