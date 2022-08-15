package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.function.Predicate;

import static java.util.stream.Collectors.counting;

public class StreamCountingExample {

    static Predicate<Student> p1 =  (student)-> student.getGpa()  >=3.9;
    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> p1.test(student))
                .collect(counting());
    };
    public static void main(String[] args) {
        System.out.println(count());

    }
}
