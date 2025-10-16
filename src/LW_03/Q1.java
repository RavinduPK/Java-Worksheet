package LW_03;

import java.util.Scanner;

// Class that handles temperature operations
class Q1 {

    private double celsius;

    public Q1() {
        celsius = 0.0;
    }

    public Q1(double c) {
        celsius = c;
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public void setCelsius(double c) {
        celsius = c;
    }

    public void setFahrenheit(double f) {
        celsius = (f - 32) * 5 / 9;
    }
}


 class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        Q1 temp = new Q1(celsiusInput);

        System.out.printf("Equivalent temperature in Fahrenheit: %.2f°F%n", temp.toFahrenheit());

        scanner.close();
    }
}
