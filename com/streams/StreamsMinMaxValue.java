package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * StreamsMinMaxValue
 */
public class StreamsMinMaxValue {

  static Function<List<Integer>, Optional<Integer>> findMaxValue = integerList -> integerList.stream().reduce(
      (x, y) -> x > y ? x : y);

  static Function<List<Integer>, Optional<Integer>> findMinValue = integers -> integers.stream().reduce((x,y) -> x<y ? x : y);

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

    Optional<Integer> minValue =  findMinValue.apply(integerList);

    System.out.println("minValue: " + minValue.orElse(0));

 /*   Optional<Integer> maxValue = findMaxValue.apply(integerList);
    System.out.println("maxValue is: " + maxValue.orElse(0));
    Optional<Integer> maxValueOption = findMaxValue.apply(integerList);
    if (maxValueOption.isPresent()){
      System.out.println("Max Value is using optional: " + maxValueOption);
    } else {
      System.out.println("Max Value is notFound");
    }*/

  }
}

