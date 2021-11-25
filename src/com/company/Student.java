package com.company;

public class Student {
    String name;
    Integer age;
    Float englishScore;
    Float mathScore;
    Float average;
    public Student(String _name, Integer _age, Float _englishScore, Float _mathScore){
        name = _name;
        age = _age;
        englishScore = _englishScore;
        mathScore = _mathScore;
        average = (englishScore + mathScore)/2;
    }
}
