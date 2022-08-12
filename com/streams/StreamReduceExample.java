package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import com.data.Student;
import com.data.StudentDataBase;

public class StreamReduceExample {

  static Function<List<Integer>, Integer> performMultiplication = integerList -> integerList.stream().reduce(1,
      (a, b) -> a * b);

  static Function<List<Integer>, Optional<Integer>> performMultiplicationWithoutIdentity = integerList -> integerList
      .stream()
      .reduce((a, b) -> a * b);
  static Supplier<Optional<Student>> getHighestGPAStudent = () -> StudentDataBase.getAllStudents().stream()
      .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 3, 5, 7);
    List<Integer> integers2 = new ArrayList<>();
    System.out.println(performMultiplication.apply(integers));

    Optional<Integer> result = performMultiplicationWithoutIdentity.apply(integers);
    Optional<Integer> result2 = performMultiplicationWithoutIdentity.apply(integers2);

    System.out.println(result.isPresent());
    System.out.println(result.get());
    System.out.println(result2.isPresent());
    

    Optional<Student> studentOptional = getHighestGPAStudent.get();
    if (getHighestGPAStudent.get().isPresent()) {
      System.out.println(studentOptional.get());
    }
  }
}
