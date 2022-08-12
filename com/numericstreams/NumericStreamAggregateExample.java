package com.numericstreams;

import java.awt.*;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is: " + sum);

        OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();
        System.out.println(optionalInt.isPresent());
        System.out.println("max value is: " + optionalInt.getAsInt());
        System.out.println(optionalInt.orElse(0));
        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();
        System.out.println("optionalLong: "  + optionalLong.orElse(0));
        OptionalDouble optionalLongAverage = LongStream.rangeClosed(1,50).average();
        System.out.println(optionalLongAverage.orElse(0));

    }
}

