package com.company;

public class Student {
    String name;
    Integer age;
    Integer englishScore;
    Integer mathScore;
    Integer average;
    public Student(String _name, Integer _age, Integer _englishScore, Integer _mathScore){
        name = _name;
        age = _age;
        englishScore = _englishScore;
        mathScore = _mathScore;
        average = (englishScore + mathScore)/2;
    }
}
