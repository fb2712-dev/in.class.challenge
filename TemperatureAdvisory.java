import java.util.Scanner;

// Author: Francesco Bortoluzzi
// Course: APANPS5175 Introduction to Programming using Java
public class TemperatureAdvisory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        System.out.print("Enter temperature in Celsius: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            scanner.close();
            return;
        }

        temperature = scanner.nextDouble();
        scanner.close();

        if (!Double.isFinite(temperature)) {
            System.out.println("Please enter a valid number.");
            return;
        }

        if (temperature < 0) {
            System.out.println("Freezing weather");
        } else if (temperature < 10) {
            System.out.println("Very Cold weather");
        } else if (temperature < 20) {
            System.out.println("Cold weather");
        } else if (temperature < 30) {
            System.out.println("Normal temperature");
        } else if (temperature <= 40) {
            System.out.println("Hot weather");
        } else {
            System.out.println("Very Hot weather");
        }
    }
}
