package org.rmit.softwaretesting;

public class GradeCalculator {
    public static String convertToGrade(int score) {

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        String grade;

        if (score < 50) {
            grade = "N";
        } else if (score < 60) {
            grade = "P";
        } else if (score < 70) {
            grade = "C";
        } else if (score < 80) {
            grade = "D";
        } else {
            grade = "H";
        }

        return grade;
    }



}
