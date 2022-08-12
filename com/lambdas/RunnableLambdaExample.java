package com.lambdas;

public class RunnableLambdaExample {
  public static void main(String[] args) {

    /*
     * Prior Java 8
     */

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Inside Runnable 1");
      }
    };
    new Thread(runnable).start();

    /*
     * Java 8 lamda
     * () -> {}
     */

    Runnable runnableLambda = () -> System.out.println("Inside Runnable 2");
    Runnable runnableLamda1 = () -> {
      System.out.println("Inside Runnable 3");
      System.out.println("Inside Runnable 3.1");
    };

    new Thread(runnableLambda).start();
    new Thread(runnableLamda1).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Inside Runnable 3.2");
      }
    });
    new Thread(() -> System.out.println("Inside Runnable 4")).start();

  }

}
