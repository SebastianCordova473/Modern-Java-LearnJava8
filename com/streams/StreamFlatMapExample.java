package com.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import com.data.Student;
import com.data.StudentDataBase;

public class StreamFlatMapExample {

  /**
   * printStudentActivities
   */
  static Supplier<List<String>> printStudentActivities = () -> StudentDataBase.getAllStudents().stream() // Stream<Student>
      .map(Student::getActivities) // Steam<List<String>>
      .flatMap(List::stream) // Stream <String>
      .collect(toList());

  /**
   * printStudentActivitiesDistinct
   */
  static Supplier<List<String>> printStudentActivitiesDistinct = () -> StudentDataBase.getAllStudents().stream() // Stream<Student>
      .map(Student::getActivities) // Stream<Lists<String>>
      .flatMap(List::stream) // Stream<String>
      .distinct()
      .collect(toList());

  /**
   * printStudentActivitiesCount
   */
  static LongSupplier printStudentActivitiesCount = () -> StudentDataBase.getAllStudents().stream()
      .map(Student::getActivities) // Stream<List<String>>
      .flatMap(List::stream) // Stream<String>
      .distinct() // Stream<String> -> with distinct function performed
      .count();

  /**
   * printStudentActivitiesSorted
   */
  static Supplier<List<String>> printStudentActivitiesSorted = () -> StudentDataBase.getAllStudents().stream()
      .map(Student::getActivities) // Stream<List<String>>
      .flatMap(List::stream) // Stream<String>
      .distinct()// Stream<String> -> with distinct function performed
      .sorted()
      .collect(toList());

  public static void main(String[] args) {
    System.out.println(printStudentActivities.get());
    System.out.println("printStudentActivitiesDistinct: " + printStudentActivitiesDistinct.get());
    System.out.println("printStudentActiviitiesCount: " + printStudentActivitiesCount.getAsLong());
    System.out.println("printStudentActivitiesSorted: " + printStudentActivitiesSorted.get());
  }

}
