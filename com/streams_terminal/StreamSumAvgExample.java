package com.streams_terminal;

import com.data.Student;
import com.data.StudentDataBase;

import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.averagingInt;
public class StreamSumAvgExample {

    public static int sum(){
          return StudentDataBase.getAllStudents().stream().collect(summingInt(Student::getNoteBooks));
    };
    public static Double average(){
        return StudentDataBase.getAllStudents().stream().collect(averagingInt(Student::getNoteBooks));
    };
    public static void main(String[] args) {
        System.out.println("total No of notebooks: " + sum());
        System.out.println("Average No of notebooks: " + average());
    }
}
