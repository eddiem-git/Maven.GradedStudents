package io.zipcoder;

import java.lang.reflect.Array;
import java.util.*;

public class Classroom {
    Student[] students;

    //given
    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudent() {
        return students;
    }

    public Double getAverageExamScore() {
        Double sumAllExams = 0.00;
        for (int currentIndex = 0; currentIndex < students.length; currentIndex++) {
            sumAllExams += students[currentIndex].getAverageExamScore();
        }
        return sumAllExams / students.length;
    }

    public void addStudent(Student student) {
        //Define a method which uses a Student parameter to add a Student object to the composite students list.
        List<Student> newStudent = new ArrayList<>(Arrays.asList(students));
        if (newStudent.contains(null)) {
        }
        for (int currentIndex = 0; currentIndex < students.length; currentIndex++) {
            if (students[currentIndex] == null) {
                newStudent.set(currentIndex, student);
            } else {
                newStudent.add(student);
            }
        }
        students = newStudent.toArray(new Student[newStudent.size()]);
    }

    public Student[] getStudents() {
        return students;
    }

    public List<Student> removeStudent(String firstName, String lastName) {
        List<Student> removalOfStudent = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < students.length; i++) {
            if (removalOfStudent.get(i).getFirstName().equals(firstName) && removalOfStudent.get(i).getLastName().equals(lastName)) {
                removalOfStudent.remove(i);
            }
            students = removalOfStudent.toArray(new Student[students.length]);
        }

        return removalOfStudent;
    }

    public Student[] getStudentsByScore() {
        Arrays.sort(students, Collections.reverseOrder());
        return students;
    }

    public Map<Student, String> getGradeBook() {
        Map<Student, String> gradeBook = new HashMap<>();
        String grade;
        for (Student student : students) {
            if (student.getAverageExamScore() >= 90)
                grade = "A";
            else if (student.getAverageExamScore() >= 80)
                grade = "B";
            else if (student.getAverageExamScore() >= 70)
                grade = "C";
            else if (student.getAverageExamScore() >= 60)
                grade = "D";
            else
                grade = "F";
            gradeBook.put(student, grade);
        }
        return gradeBook;
    }
}
