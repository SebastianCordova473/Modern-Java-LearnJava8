package com.functionalinterfaces;
public class FunctionExample1 {

  public static String perfomConcat(String str) {
    return FunctionExample.addSomeString.apply(str);
  }

  public static void main(String[] args) {
    String result = perfomConcat("hello");
    System.out.println("Result: " + result);
  }
}
