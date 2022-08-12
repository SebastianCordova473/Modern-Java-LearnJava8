package com.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.data.Student;
import com.data.StudentDataBase;

public class BifunctionExample {

  static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bifuntion = ((students,
      studentPredicate) -> {
    Map<String, Double> studentGradeMap = new HashMap<>();
    students.forEach(student -> {
      if (studentPredicate.test(student)) {
        studentGradeMap.put(student.getName(), student.getGpa());
      }
    });
    return studentGradeMap;
  });

  public static void main(String[] args) {
    System.out.println(bifuntion.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p2));
  }
}
