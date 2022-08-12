package com.functionalinterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.data.Student;
import com.data.StudentDataBase;

public class SupplierExample {
  public static void main(String[] args) {
    Supplier<Student> studentSupplier = () -> {
      return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
    };
    Supplier<List<Student>> liSupplier = () -> StudentDataBase.getAllStudents();
    System.out.println("Students  is: " + studentSupplier.get());
    System.out.println("Students  are: " + liSupplier.get());
  }

}
