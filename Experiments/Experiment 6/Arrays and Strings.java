import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        String[][] students = new String[numStudents][2];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            students[i][0] = scanner.nextLine();
            System.out.print("Enter score for student " + (i + 1) + ": ");
            students[i][1] = scanner.nextLine();
        }

        System.out.println("\nStudents and their scores:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i][0] + ", Score: " + students[i][1]);
        }

        double averageScore = calculateAverageScore(students);
        System.out.println("\nAverage Score: " + averageScore);

        scanner.close();
    }

    public static double calculateAverageScore(String[][] students) {
        int totalScore = 0;
        for (int i = 0; i < students.length; i++) {
            totalScore += Integer.parseInt(students[i][1]);
        }
        return (float) totalScore / students.length;
    }
}
/*
Output:
Enter the number of students: 3

Enter name for student 1: Jacab
Enter score for student 1: 60

Enter name for student 2: Sam
Enter score for student 2: 48

Enter name for student 3: Haby
Enter score for student 3: 52

Students and their scores:
Student: Jacab, Score: 60
Student: Sam, Score: 48
Student: Haby, Score: 52

Average Score: 53.33
*/
