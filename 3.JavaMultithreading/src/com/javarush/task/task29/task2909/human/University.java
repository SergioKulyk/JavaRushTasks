package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    int age;
    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students)
            if (student.getAverageGrade() == averageGrade)
                return student;
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student student = null;
        if (students.size() > 0) {
            student = students.get(0);
            for (int i = 1; i < students.size(); i++)
                if (students.get(i).getAverageGrade() > student.getAverageGrade())
                    student = students.get(i);
        }
        return student;
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        Student student = null;
        if (students.size() > 0) {
            student = students.get(0);
            for (int i = 1; i < students.size(); i++)
                if (students.get(i).getAverageGrade() < student.getAverageGrade())
                    student = students.get(i);
        }
        return student;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}