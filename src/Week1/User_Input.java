package Week1;

import java.util.Scanner;
//will allow us to use the scanner ^

public class User_Input {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        //String input = scanner.next();

        //System.out.println(input);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner2.next();
        System.out.println(userName + " is a nice name.\n");
        System.out.println("There are " + userName.length() + " characters in your name.");

        System.out.println("\nHow old are you? " + userName);
        int userAge = scanner.nextInt();
        System.out.println("You are " + userAge + ". \nIn another " + userAge + " years you will be " + 2 * userAge);

        //System.out.println("\n How tall are you?");
        //double userHeight = scanner.nextDouble();
        //System.out.println("You are " + userHeight);

//        to round long decimal numbers
//        %d for integer %s for strings and %f for floats
        //System.out.format("I have %d cats, %.3f dogs, and 1 %s", 7, 2.0, "panther");


    }
}
