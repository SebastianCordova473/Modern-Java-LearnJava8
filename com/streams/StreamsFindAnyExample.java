package com.streams;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamsFindAnyExample {
  static Predicate<Student> p1 = student -> student.getGpa()>=3.9;
  static Predicate<Student> p2 = student -> student.getGpa()>=3.9;
  static Supplier<Optional<Student>> findAnyStudent = () ->
      StudentDataBase.getAllStudents().stream()
              .filter(p1).findAny();

  static Supplier<Optional<Student>> findFirstStudent = ()->
          StudentDataBase.getAllStudents()
                  .stream().filter(p2).findFirst();

    public static void main(String[] args) {
        System.out.println("findAnyStudent: " + findAnyStudent.get().orElse(new Student()));
        System.out.println("findAnyStudent: " + findFirstStudent.get().orElse(new Student()));
    }
}
