import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        /* Design a program that asks for 3 grades
         * Calculates the average from 3 grades and
         * prints the average with the final grade
         */

        Scanner scanner = new Scanner(System.in);
        double grade1, grade2, grade3, average;
        char finalGrade;

        // INPUT
        System.out.println("This program will give you the average 3 and the final Grade.");
        System.out.print("Enter grade 1: ");
        grade1 = scanner.nextDouble();
        System.out.print("Enter grade 2: ");
        grade2 = scanner.nextDouble();
        System.out.print("Enter grade 3: ");
        grade3 = scanner.nextDouble();

        scanner.close();

        // OPERATIONS
        average = (grade1 + grade2 + grade3) / 3;

        // CHECK THE FINAL GRADE
        if (average >= 91) {
            finalGrade = 'A';
        } else
        if (average >= 81) {
            finalGrade = 'B';
        } else
        if (average >= 71) {
            finalGrade = 'C';
        } else 
        if (average >= 61) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }

        // OUTPUT
        System.out.println("Your average is [" + average + "] and your grade [" + finalGrade + "].");

    }
}