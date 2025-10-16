package LW_03;

import java.util.Scanner;

public class Q3 {
    private double outerRadius;
    private double innerRadius;
    private static final double PI = 3.14159;


    public Q3() {
        innerRadius = 0.0;
        outerRadius = 0.0;
    }


    public void setRadii(double r1, double r2) {

        if (r1 > r2) {
            outerRadius = r1;
            innerRadius = r2;
        } else {
            outerRadius = r2;
            innerRadius = r1;
        }
    }


    public double getComputeArea() {
        return PI * outerRadius * outerRadius - PI * innerRadius * innerRadius;
    }


    public double getComputeCircumference() {
        return 2 * PI * outerRadius + 2 * PI * innerRadius;
    }
}

class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first radius: ");
        double r1 = scanner.nextDouble();

        System.out.print("Enter second radius: ");
        double r2 = scanner.nextDouble();


        Q3 ring = new Q3();
        ring.setRadii(r1, r2);


        System.out.printf("Area of the ring: %.2f%n", ring.getComputeArea());
        System.out.printf("Circumference of the ring: %.2f%n", ring.getComputeCircumference());

        scanner.close();
    }
}
