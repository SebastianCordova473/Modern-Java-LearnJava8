package com.functionalinterfaces;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.data.Student;
import com.data.StudentDataBase;

public class PredicateAndConsumer {

  Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
  Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

  BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

  BiConsumer<String, List<String>> studeBiConsumer = (name, activities) -> System.out
      .println(name + " : " + activities);

  Consumer<Student> studentConsumer = (student -> {
    if (p1.and(p2).test(student)) {
      studeBiConsumer.accept(student.getName(), student.getActivities());
    }
  });

  Consumer<Student> studentConsumer1 = (student -> {
    if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
      studeBiConsumer.accept(student.getName(), student.getActivities());
    }
  });

  public void printNameAndActivities(List<Student> students) {
    System.out.println("studentConsumer with Predicate: ");
    students.forEach(studentConsumer);
    System.out.println("studentConsumer1 with BiPredicate: ");
    students.forEach(studentConsumer1);
  }

  public static void main(String[] args) {
    List<Student> students = StudentDataBase.getAllStudents();
    new PredicateAndConsumer().printNameAndActivities(students);
  }
}
