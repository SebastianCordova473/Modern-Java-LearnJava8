package com.methodrefferences;

import java.util.function.Predicate;
import java.util.function.Supplier;

import com.data.Student;
import com.data.StudentDataBase;

public class RefactorMethodReferenceExample {
  static Predicate<Student> p1 = RefactorMethodReferenceExample::gretherThanGradeLevel;

  public static boolean gretherThanGradeLevel(Student s) {
    return s.getGradeLevel() >= 3;
  }

  public static void main(String[] args) {
    System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
  }

}
