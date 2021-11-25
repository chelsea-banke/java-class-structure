package com.company;

import java.util.Scanner;

public class Main {
    public static Integer getInt(Scanner get){
        int val;
        while (true){
            try {
                val = Integer.parseInt(get.next());
                break;
            }
            catch(Exception e){
                System.out.print("!!! Enter an integer value: ");
            }
        }
        return val;
    }
    public static float getFloat(Scanner get){
        float val;
        while (true){
            try {
                val = Float.parseFloat(get.next());
                break;
            }
            catch(Exception e){
                System.out.print("!!! Enter an number value: ");
            }
        }
        return val;
    }
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
        int _rank = 1;
        System.out.println(" ");
        for (Student student : students) {
            System.out.println(_rank + ")  name: " + student.name + ", age: " + student.age + ", english-score: " + student.englishScore + ", math-score: " + student.mathScore + ", average: " + student.average);
            _rank ++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter class size: ");
        int length = getInt(input);
        while (length<10){
            System.out.println("!!! class size must be greater than or equal to 10 !!!");
            System.out.print("enter class size: ");
            length = getInt(input);
        }
        Student[] classR = new Student[length];
        for (int i=0; i<length; i++) {
            System.out.println("");
            System.out.println("Student " + (i + 1));
            System.out.print("enter student's name: ");
            String name = input.next();
            System.out.print("enter student's age: ");
            int age = getInt(input);
            System.out.print("enter student's english score: ");
            float enScore = getFloat(input);
            System.out.print("enter student's math score: ");
            float mathScore = getFloat(input);
            classR[i] = new Student(name, age, enScore, mathScore);
        }
        display(rank(classR));
    }
}
