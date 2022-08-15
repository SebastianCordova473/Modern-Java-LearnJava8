package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {
    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        mapping(Student::getName,toList())
                );
        System.out.println("nameList: " + nameList);

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        mapping(Student::getName, toSet())
                );
        System.out.println("nameSet: " + namesSet);

    }
}
