package com.streams;

import static java.util.stream.Collectors.toList;

import com.data.Student;
import com.data.StudentDataBase;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class StreamComparator {

  static Supplier<List<Student>> sortStudentByName = () ->
    StudentDataBase
      .getAllStudents()
      .stream()
      .sorted(Comparator.comparing(Student::getName))
      .collect(toList());

  static Supplier<List<Student>> sortStudentByGpa = () ->
    StudentDataBase
      .getAllStudents()
      .stream()
      .sorted(Comparator.comparing(Student::getGpa))
      .collect(toList());

  static Supplier<List<Student>> sortStudentByGpaDesc = () ->
    StudentDataBase
      .getAllStudents()
      .stream()
      .sorted(Comparator.comparing(Student::getGpa).reversed())
      .collect(toList());

  public static void main(String[] args) {
    System.out.println("Students sorted by name: ");
    sortStudentByName.get().forEach(System.out::println);

    System.out.println("Students sorted by Gpa: ");
    sortStudentByGpa.get().forEach(System.out::println);

    System.out.println("Students sorted by Gpa Desc: ");
    sortStudentByGpaDesc.get().forEach(System.out::println);
  }
}
