package com.functionalinterfaces;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.data.Student;
import com.data.StudentDataBase;

public class FunctionStudentExample {

  static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
    Map<String, Double> stundentGradeMap = new HashMap<>();
    students.forEach((student -> {
      if (PredicateStudentExample.p1.test(student)) {
        stundentGradeMap.put(student.getName(), student.getGpa());
      }
    }));
    return stundentGradeMap;
  });

  public static void main(String[] args) {
    System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
  }
}
