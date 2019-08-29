package chaper2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {

     // Get the number of hours worked
        System.out.println("Enter the number of hours the employee works");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

     // Get the hourly pay rate
        System.out.println("Enter pay rate.");
        double rate = scanner.nextDouble();
        // Close scanner because we are no longer using it to grab user input.
        scanner.close();

     // Multiply hours and pay rate

        double grossPay = hours * rate;

     // Display result
        System.out.println("Employee gross pay is $" + grossPay);

    }
}
