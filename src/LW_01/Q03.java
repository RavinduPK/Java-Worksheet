package LW_01;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in centimeters: ");
        double centimeter = scanner.nextDouble();


        double inches = centimeter / 2.54;

        System.out.println("Value in inches: " + inches);

        scanner.close();
    }
}
