package com.company;

import java.util.Scanner;

public class Main {
    public static Student[] rank(Student[] unscaled) {
        for (int i=0; i<unscaled.length; i++){
            int max = i;
            for (int j=i; j<unscaled.length; j++){
                if (unscaled[j].average > unscaled[max].average){
                    max = j;
                }
            }
            Student temp = unscaled[i];
            unscaled[i] = unscaled[max];
            unscaled[max] = temp;
        }
        return unscaled;
    }
    public static void display(Student[] students){
        int length = students.length;
        System.out.println(" ");
        for (Student student : students) {
            System.out.println("name: " + student.name + ", age: " + student.age + ", english-score: " + student.englishScore + ", math-score: " + student.mathScore + ", average: " + student.average);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter class size: ");
        int length = input.nextInt();
        while (length<4){
            System.out.println("!!! class size must be greater than or equal to 10 !!!");
            System.out.print("enter class size: ");
            length = input.nextInt();
        }
        Student[] classR = new Student[length];
        for (int i=0; i<length; i++){
            System.out.println("");
            System.out.println("Student " + (i+1));
            System.out.print("enter student's name: ");
            String name = input.next();
            System.out.print("enter student's age: ");
            int age = input.nextInt();
            System.out.print("enter student's english score: ");
            int enScore = input.nextInt();
            System.out.print("enter student's math score: ");
            int mathScore = input.nextInt();
            classR[i] = new Student(name, age, enScore, mathScore);
        }
        classR = rank(classR);
        display(classR);
    }
}
