import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          System.out.print("Enter the student's score in range of 1 to 100: ");
        int score = sc.nextInt();

          char grade = calculateGrade(score);

        System.out.println("The student's grade is: " + grade);

    }

    // Method to calculate grade based on score
    public static char calculateGrade(int score) {
        char grade;
        if (score==100) {
            grade = 'O';
        } else if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
