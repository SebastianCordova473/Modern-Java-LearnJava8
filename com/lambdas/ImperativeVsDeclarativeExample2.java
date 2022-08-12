package com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ImperativeVsDeclarativeExample2 {
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

    /*
     * Imperative
     */
    List<Integer> uniqueList = new ArrayList<>();
    for (Integer integer : integerList) {
      if (!uniqueList.contains(integer)) {
        uniqueList.add(integer);
      }
    }

    System.out.println("UniqueList: " + uniqueList);

    /*
     * declarative
     */

    List<Integer> uniqueList1 = integerList.stream()
            .distinct()
            .collect(toList());

    System.out.println("uniqueList1: " + uniqueList1);

  }
}
