package LW_03;

import java.util.Scanner;

public class Q2 {
    private double fahrenheit;


public Q2() {
    fahrenheit = 0.0;
}
 public  Q2(double f){
    fahrenheit = f;
 }

 public double toFarenheit(){
    return fahrenheit;
 }
  public double toCelsius(){
    return (fahrenheit - 32) * 5 / 9;
  }

  public void setFarenheit(double f){
    fahrenheit = f;
  }
   public void setCelsius(double c){
    fahrenheit = (c * 9 / 5) + 32;
   }

   }

    class Temperature{
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
              System.out.print("Enter temperature in Fahrenheit: ");
              Double input = scanner.nextDouble();

              Q2 temp = new Q2();
              temp.setFarenheit(25.0);

                System.out.printf("Equivalent temperature in Celsius: %.2f°C%n", temp.toCelsius());
       }
   }