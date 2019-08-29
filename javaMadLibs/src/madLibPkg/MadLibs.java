package madLibPkg;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]) {

        System.out.println("What is your favorite season of the year?");
        Scanner scanner = new Scanner(System.in);

        String userSeason  = scanner.nextLine();

        System.out.println("Give me an adjectisve.");

        String userAdjective = scanner.nextLine();

        System.out.println("Lastly, give me a Whole number.");

        int userWholeNumber = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + userAdjective + " " + userSeason + " day, I drink a minimum of " + userWholeNumber + " cups of coffee..!" );



        }
}
