package com.streams;

import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.data.Student;
import com.data.StudentDataBase;

public class StreamMapReduceExample {

  static Predicate<Student> p1 = s1 -> s1.getGradeLevel() >= 3;
  static Predicate<Student> p2 = s2 -> s2.getGender().equals("female");

  // static IntSupplier
  static IntSupplier noOfNoteBooks = () -> StudentDataBase.getAllStudents().stream()// stream<Student>
      .filter(student -> p1.test(student))
      .filter(student -> p2.test(student))
      .map(Student::getNoteBooks) // Stream<Integer>
      // .reduce(0, (a, b) -> a + b);
      .reduce(0, Integer::sum);

  public static void main(String[] args) {

    System.out.println("noOfNotebooks: " + noOfNoteBooks.getAsInt());
  }
}
