package com.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.data.Student;
import com.data.StudentDataBase;


public class BiConsumerExample {

  public static void nameAndActivities() {
    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
  }

  public static void main(String[] args) {
    BiConsumer<String, String> biConsumer = (a, b) -> {
      System.out.println("a: " + a + ", b: " + b);
    };
    biConsumer.accept("JAVA", "7");

    BiConsumer<Integer, Integer> multiply = (a, b) -> {
      System.out.println("Multiplication is: " + a * b);
    };

    BiConsumer<Integer, Integer> division = (a, b) -> {
      System.out.println("Division is: " + a / b);
    };

    multiply.andThen(division).accept(10, 5);
    nameAndActivities();
  }
}
