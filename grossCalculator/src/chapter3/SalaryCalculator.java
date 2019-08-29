package chapter3;

import java.util.Scanner;

/*
IF statement
All salespeople get a payment of $100 a week
Salespeople whe exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main(String args[]) {
        //Init known values

        int salary = 1000;
        int bonus = 250;
        int quota = 10;


        // Get values from the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        // Close scanner because we are no longer using it to grab user input.
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary += bonus;
        }

        // Output

        System.out.println("Your salary is: $" + salary);
    }


}
