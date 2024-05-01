import java.util.Scanner;

public class StudentExamScores {
    public static void main(String[] args) {
        // Define the scores for each student exams
        double[][][] scores = {
            {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
            {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
            {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
            {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
            {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
            {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}},
            {{1.5, 29.5}, {6.4, 22.5}, {14, 30.5}, {10, 30.5}, {16, 6.0}}
        };

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student number (1-7): ");
        int studentNumber = scanner.nextInt();

        // Check if the entered student number is valid
        if (studentNumber >= 1 && studentNumber <= scores.length) {
            // Get the scores of the specified student
            double[][] studentScores = scores[studentNumber - 1];
            System.out.println("Student " + studentNumber + " Marks details");

            // Display the exam marks details for the student
            for (int i = 0; i < studentScores.length; i++) {
                System.out.println("Subject " + (i + 1) + " Mark Details");
                System.out.println("Exam 1 : " + studentScores[i][0]);
                System.out.println("Exam 2 : " + studentScores[i][1]);
            }
        } else {
            System.out.println("Invalid student number. Please try again.");
        }
    }
}