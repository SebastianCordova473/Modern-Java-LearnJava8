package com.lambdas;

import java.util.stream.IntStream;

/**
 * ImperativeVsDeclarative
 */
public class ImperativeVsDeclarativeExample1 {
  public static void main(String[] args) {
    /*
     * Imperative - how style of programming
     */

    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      sum += i;
    }

    System.out.println("Sum using Imperative approach: " + sum);
    /*
     * Declarative Style of Programing - What style of programming
     * 
     */

    int sum1 = IntStream.rangeClosed(0, 100)
        .parallel()
        .sum();

    System.out.println("Sum using declarative approach: " + sum1);

  }

}