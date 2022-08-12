package com.methodrefferences;

import java.util.function.Consumer;

import com.data.Student;
import com.data.StudentDataBase;

public class ConsumerMethodReference {
  /*
   * classname::methodname
   */
  static Consumer<Student> c1 = System.out::println;

  /*
   * Classname:instanceMethod
   */

  static Consumer<Student> c2 = Student::printListOfActvities;

  public static void main(String[] args) {
    StudentDataBase.getAllStudents().forEach(c1);
    StudentDataBase.getAllStudents().forEach(c2);
  }
}
