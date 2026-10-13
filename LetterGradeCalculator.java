import java.util.Scanner;

// Author: Francesco Bortoluzzi
// Course: APANPS5175 Introduction to Programming using Java
public class LetterGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        char grade;

        System.out.print("Enter a score from 0 to 100: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number from 0 to 100.");
            scanner.close();
            return;
        }

        score = scanner.nextInt();
        scanner.close();

        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100.");
            return;
        }

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Score: " + score + ", Grade: " + grade);
    }
}
