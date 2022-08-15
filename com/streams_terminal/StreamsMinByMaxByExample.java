package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Optional;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {
    public static Optional<Student> minBy_example(){
        return Optional.of(StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(comparing(Student::getGpa))).orElse(new Student()));
    }
    public static Optional<Student> maxBy_example(){
        return Optional.of(StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(comparing(Student::getGpa))).orElse(new Student()));
    }

    public static void main(String[] args) {
        System.out.println("minBy_Example: " + minBy_example());
        System.out.println("maxBy_Example: " + maxBy_example());
    }
}
