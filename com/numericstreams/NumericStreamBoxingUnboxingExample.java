package com.numericstreams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamBoxingUnboxingExample {

    static Supplier<List<Integer>>
            boxing = ()-> IntStream.rangeClosed(1,50)
                    .boxed().collect(toList());

    static Function<List<Integer>, Integer> unBoxing =
            //wrapper to primitive
            (integerList)-> integerList.stream()
                    //Wrapper integer values
                    .mapToInt(Integer::intValue) //intstream(intvalue of the Wrapper class)
                    .sum();

    public static void main(String[] args) {
        System.out.println("Boxing: " + boxing.get());
        System.out.println("UnBoxing: " +unBoxing.apply(boxing.get()));
    }
}
