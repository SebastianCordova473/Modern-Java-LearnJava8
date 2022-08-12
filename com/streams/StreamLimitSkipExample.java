package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StreamLimitSkipExample {


    static Function<List<Integer>, Optional<Integer>>  limit = integers ->
         integers.stream().limit(3).reduce(Integer::sum);

    static Function<List<Integer>, Optional<Integer>> skip = integers ->
            integers.stream().skip(3).reduce(Integer::sum);

    public static void main(String[] args) {
        List<Integer> integers =  Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> limitResult = limit.apply(integers);
        System.out.println("limitResult: " + limitResult.orElse(0));

        Optional<Integer> skipResult = skip.apply(integers);
        System.out.println("skipResult: " + skipResult.orElse(0));



    }
}
