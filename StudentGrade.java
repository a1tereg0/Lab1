import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrade {
    private final static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String studentName = keyboard.next();
        System.out.println("Enter your grade percentage: ");
        double grade = -1;
        try {
            do {
                grade = keyboard.nextDouble();
                if (grade <0 || grade > 100) {
                    System.out.println("Please enter a number in range 0-100: ");
                }
            } while (grade < 0 || grade >100 );

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Enter a number.");
        }

            char letterGrade;
            if (grade < 50) {
                letterGrade = 'F';
            } else if (grade < 60) {
                letterGrade = 'D';
            } else if (grade < 70) {
                letterGrade = 'C';
            } else if (grade < 80) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println(studentName+", your letter grade is: "+letterGrade);


    }
}
