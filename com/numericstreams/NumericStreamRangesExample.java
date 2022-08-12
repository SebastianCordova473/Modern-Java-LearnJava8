package com.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream =  IntStream.range(1,50);
        System.out.println("Range count : " + intStream.count());
        IntStream intStream1 = IntStream.rangeClosed(1,50);
        System.out.println("count rangeClose: " +  intStream1.count());

        System.out.println();
        IntStream.range(1,50).forEach(value -> System.out.print(value + ","));
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print( value + ","));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1,50);
        System.out.println("cound longStream: " + longStream.count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        IntStream.range(1,50).asDoubleStream().forEach((value -> System.out.print(value + ",")));
        System.out.println();

    }
}
