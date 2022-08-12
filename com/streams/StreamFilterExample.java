package com.streams;

import static java.util.stream.Collectors.toList;

import com.data.Student;
import com.data.StudentDataBase;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamFilterExample {

  static Predicate<Student> p1 = student -> student.getGender().equals("female");
  static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

  static Supplier<List<Student>> filterStudents = () -> StudentDataBase
      .getAllStudents()
      .stream()
      .filter(student -> p1.and(p2).test(student))
      .collect(toList());

  public static void main(String[] args) {
    System.out.println("filterStudents: " + filterStudents.get());
  }
}
