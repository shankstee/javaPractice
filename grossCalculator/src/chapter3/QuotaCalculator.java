package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){

        // init values we know
        int quota = 10;



        //Get unknown values
        System.out.println("Enter the number of sales your made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make a decision on the path to take - Output
        if (sales >= quota)
            System.out.println("Congrats quota met!!");

         else {
            int salesShort = quota - sales;
            System.out.println("You were short from your quota by: " + salesShort);
        }
    }
}
