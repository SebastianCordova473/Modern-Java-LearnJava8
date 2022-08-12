package com.lambdas;

import java.util.Comparator;

public class ComparatorLamdaExample {
  public static void main(String[] args) {
    /**
     * Prior java 8
     */

    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
      }
    };

    System.out.println("Result of Comparator: " + comparator.compare(3, 3));

    Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
    System.out.println("Result of comparator: " + comparatorLambda.compare(3, 3));

    Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
    System.out.println("Result of comparator: " + comparatorLambda1.compare(3, 3));

  }

}
