package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

public class StudentTest {

    @Test
    public void testExamScores() {
        // : Given we have expected exam scores
        Double[] examScores = {99.00, 25.00, 45.00, 36.99};
        // When the actual scores = to student .getExamScores
        Student student = new Student("", "", examScores);
        String actualExamScores = student.getExamScores();
        String expectedExamScores = "Exam Scores:\n" +
                "\tExam 1 -> 99.0\n" +
                "\tExam 2 -> 25.0\n" +
                "\tExam 3 -> 45.0\n" +
                "\tExam 4 -> 37.0\n";

        // Then
        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    // : Given
    public void testAddExamScore() {

        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);
        // When
        student.addExamScore(100.00);
        String actualOutput = student.getExamScores();
        String expectedOutput = "Exam Scores:\n\tExam 1 -> 100.0\n";
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    // : Given
    public void testGetAverageExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.00};
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double actualOutput = student.getAverageExamScore();
        Double expectedOutput = 125.0;

                // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    //Given
    public void testToString() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.00};
        Student student = new Student(firstName, lastName, examScores);

        //When
        Double actualOutput = student.getAverageExamScore();
        Double expectedOutput = 125.0;
        System.out.println(student.toString());
        //Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}