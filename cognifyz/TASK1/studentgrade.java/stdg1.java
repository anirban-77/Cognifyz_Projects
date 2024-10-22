import java.util.Scanner;
public class stdg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();

        double[] grades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / numberOfGrades;

        System.out.printf("The average grade is: %.2f%n", average);

        scanner.close();
    }
}
