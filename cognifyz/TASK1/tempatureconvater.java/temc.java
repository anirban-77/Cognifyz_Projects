import java.util.Scanner;

public class temc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().toUpperCase().charAt(0);

    
        if (unit == 'C') {
            
            double convertedTemperature = (temperature * 9/5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, convertedTemperature);
        } else if (unit == 'F') {
            
            double convertedTemperature = (temperature - 32) * 5/9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, convertedTemperature);
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }

    
        scanner.close();
    }
}
