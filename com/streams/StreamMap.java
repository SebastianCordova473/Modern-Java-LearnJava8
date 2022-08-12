package com.streams;

import java.util.List;
import java.util.Set;

import com.data.Student;
import com.data.StudentDataBase;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMap {

  public static List<String> namesList() {
    return StudentDataBase.getAllStudents().stream()// Stream<Student>
        // Student as an input -> Student Name
        .map(Student::getName) // Stream<String>
        .map(String::toUpperCase)// Stream<String> -> uppercase operation on each input
        .collect(toList());// List<String>
  }

  public static Set<String> namesSet() {
    return StudentDataBase.getAllStudents().stream()// Stream<Student>
        // Student as an input -> Student Name
        .map(Student::getName) // Stream<String>
        .map(String::toUpperCase)// Stream<String> -> uppercase operation on each input
        .collect(toSet());// Set<String>
  }

  public static void main(String[] args) {
    System.out.println(namesList());
    System.out.println(namesSet());

  }

}
