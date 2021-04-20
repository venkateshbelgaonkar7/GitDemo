package com.stringdemo;

import com.mylambdapractice.AbstractDemo;
import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        Student obj = new Student("venka", 80);
        System.out.println(obj.getName());

        List<Student> students = new ArrayList<>();
        students.add(new Student("virat", 90));
        students.add(new Student("ankush", 50));
        students.add(new Student("abhi", 60));
        students.add(new Student("pranav", 70));



        /* Enhanced for loop */
//        for (Student var : students)
//        {
//            System.out.println(var);
//        }
//
//        for (int i = 0; i < students.size(); i++){
//            System.out.println(students.get(i));
//        }

        /* For-Each method */
//        Anonymous inner interface
//        Consumer<Student> con = new Consumer<Student>() {
//            @Override
//            public void accept(Student student) {
//                System.out.println(student);
//            }
//        };

//        students.forEach(con);

        // Using lambda (see up for reference)
//        Consumer<Student> con = student -> System.out.println(student);
//
        students.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });
//
//        students.forEach(student-> System.out.println(student));



        Collections.sort(students);



    }
}

/* For reference to lombok framework see boilerplate code in wiki */
@Getter
@Setter
@AllArgsConstructor


class Student implements Comparable<Student>{
    String name;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

//    public Student(String name, int marks) {
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getMarks() {
//        return marks;
//    }//    @Override
//    public int compareTo(Student that) {
//        return 0;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//
    @Override
    public int compareTo(Student that) {
        return 0;
    }


}
