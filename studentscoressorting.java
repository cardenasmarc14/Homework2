import java.util.Scanner;

public class StudentScoresSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the answer key
        String[] answerKey = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
        System.out.println("Fill in the eight students' answers to 10 questions");

        // Create a 2D array to store the student answers and scores
        String[][] studentAnswers = new String[8][10];
        int[][] scoreArray = new int[8][1];

        // Input student answers and calculate their scores
        for (int i = 0; i < studentAnswers.length; i++) {
            int scoreCount = 0;
            for (int j = 0; j < studentAnswers[i].length; j++) {
                studentAnswers[i][j] = scanner.next();
                // Checking if the answer matches the answer key
                if (studentAnswers[i][j].equalsIgnoreCase(answerKey[j])) {
                    scoreCount++;
                    scoreArray[i][0] = scoreCount;
                }
            }
        }

        // Create an array to store the students
        int[] studentIndexes = { 0, 1, 2, 3, 4, 5, 6, 7 };

        // Sorting students using bubble sort
        for (int i = 0; i < scoreArray.length; i++) {
            for (int j = 0; j < scoreArray.length - 1; j++) {
                if (scoreArray[j][0] > scoreArray[j + 1][0]) {
                    // Swap scores
                    int tempScore = scoreArray[j][0];
                    scoreArray[j][0] = scoreArray[j + 1][0];
                    scoreArray[j + 1][0] = tempScore;

                    // Swap student indexes
                    int tempIndex = studentIndexes[j];
                    studentIndexes[j] = studentIndexes[j + 1];
                    studentIndexes[j + 1] = tempIndex;
                }
            }
        }

        // Displaying the results
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println("Student " + studentIndexes[i] + " score per order: " + scoreArray[i][0]);
        }
    }
}