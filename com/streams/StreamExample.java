package com.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.data.Student;
import com.data.StudentDataBase;

public class StreamExample {

  public static void main(String[] args) {
    // student name and there activities in a map
    Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
    Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);
    Map<String, List<String>> studentMap = StudentDataBase
        .getAllStudents()
        .stream()
        .peek((student) -> {
          // System.out.println(student);
        })
        .filter(studentGpaPredicate)
        .peek((student) -> {
          // System.out.println("After first filter: " + student);
        })
        .filter(studentPredicate)
        .peek((student) -> {
          System.out.println("After second filter: " + student);
        })
        .collect(Collectors.toMap(Student::getName, Student::getActivities));

    System.out.println(studentMap);
  }
}
