package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String arg[]) {
        //Initialize what we know
        int requiredSalaray = 30000;
        int requiredYearEmployed = 2;
        // Get what we don't
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

        scanner.close();


        //Make decision

        if (salary >= requiredSalaray) {
            if(years >= requiredYearEmployed ) {
                System.out.println("You qualify for the loan!! Woot Woot ");

            }
            else {
                System.out.println("You make enough, but you need to work at least 2 years at your " +
                        "current job");
            }
        } else {
            System.out.println("You need to make a lil more money!");
        }
    }
}
