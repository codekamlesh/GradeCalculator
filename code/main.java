import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator!");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        System.out.println("Enter marks obtained in each subject (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
        }

        Calculator calculator = new Calculator();
        int totalMarks = calculator.calculateTotalMarks(marks);
        double averagePercentage = calculator.calculateAveragePercentage(totalMarks, numSubjects);
        char grade = calculator.calculateGrade(averagePercentage);

        System.out.println("\nCalculating your grades...");

        // Simulate processing delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n----- Results -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Additional feature: Provide feedback
        System.out.println("\nThank you for using the Grade Calculator!");

        scanner.close();
    }
}
