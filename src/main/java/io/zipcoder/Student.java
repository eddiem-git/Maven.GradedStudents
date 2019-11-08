package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
//Instance Fields
    ArrayList<Double> examScores;
    String lastName;
    String firstName;


    //Build constructor
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }
    //Student should define a method that gets all exams as a string representation

    public String getExamScores() {
            StringBuilder representation = new StringBuilder();
             representation.append("Exam Scores:\n");
        for (int currentIndex = 0; currentIndex < examScores.size(); currentIndex++) {
            representation.append(String.format("\tExam %d -> %.1f\n" , 1+currentIndex, examScores.get(currentIndex)));
            }
        return representation.toString();
        }

    public String addExamScore(Double examScore){
        String result  = "";
            examScores.add(examScore);
            result = getExamScores();
            return result;
    }
    public void getTestScore(){

    }
    public Double getAverageExamScore(){
            Double sumExams = 0.0;
        for (int currentIndex = 0; currentIndex < getNumberOfExamsTaken(); currentIndex++) {
             sumExams += examScores.get(currentIndex);
        }
        return sumExams / getNumberOfExamsTaken();
    }
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public String toString(){
        StringBuilder stringRepresentation = new StringBuilder();
        stringRepresentation.append("Student Name: ").append(getFirstName()).append(" ").append(getLastName());
        stringRepresentation.append("\n> Average Score: ").append(getAverageExamScore());
        stringRepresentation.append("\n>  ").append(getExamScores());

        return stringRepresentation.toString();

    }
}
