package com.lambdas;

import java.util.function.Consumer;

public class LambdaVariable {

  public static void main(String[] args) {
    int i = 0;
    Consumer<Integer> c1 = (i1) -> {
      System.out.println("value is: " + i);
    };
  }
}
