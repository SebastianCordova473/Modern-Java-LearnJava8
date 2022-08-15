package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import static java.util.stream.Collectors.joining;

public class StreamsJoningExample {

    public static String joining_1 (){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    };
    public static String joining_2 (){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-"));
    };
    public static String joining_3 (){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-","(",")"));
    };

    public static void main(String[] args) {
        System.out.println("joining_1: " + joining_1());
        System.out.println("joining_1: " + joining_2());
        System.out.println("joining_1: " + joining_3());
    }
}
