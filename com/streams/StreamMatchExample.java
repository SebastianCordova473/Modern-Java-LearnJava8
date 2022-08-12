package com.streams;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public class StreamMatchExample {

    static Predicate<Student> p1 = (student) -> student.getGpa()>= 3.5;
    static Predicate<Student> p2 = student -> student.getGpa()>=4.0;
    static Predicate<Student>p3 = student -> student.getGpa()>=4.1;
    static BooleanSupplier allMatch = () ->StudentDataBase.getAllStudents().stream().allMatch(p1);
    static BooleanSupplier anyMatch = ()-> StudentDataBase.getAllStudents().stream().anyMatch(p2);

    static BooleanSupplier noneMatch = ()-> StudentDataBase.getAllStudents().stream().noneMatch(p3);
    public static void main(String[] args) {
        System.out.println("Result of AllMatch: " + allMatch.getAsBoolean());
        System.out.println("Result of AnyMatch: " + anyMatch.getAsBoolean());
        System.out.println("Result of NoneMatch: " + noneMatch.getAsBoolean());

    }


}
