package JavaNotes.Conditionals;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/*
        System.out.printf("Please enter your height:");
        int height = scanner.nextInt();
*/

/*
        if (height < 130 || height > 210) {
            System.out.println("Sorry you don't meet the height requirements");
        }
        else {
            System.out.println("Have fun!");
        }
*/

/*
        System.out.printf("How old are you? ");
        int age = scanner.nextInt();


        if (age >= 18){
            System.out.println("Are you a VIP? yes/no");
            String vipPassReply = scanner.next();
            if(vipPassReply.equals("yes")){
                System.out.println("Thanks go on in.");
            }
            else{
                System.out.println("Sorry you must be a VIP or be over 70");
            }
        }
        else {
            System.out.println("Sorry you must be over 18");
        }
*/

/*
        if (age >= 70 || age >= 18 && vipPassReply.equals("yes") ){
            System.out.println("Thanks go on in");
        }
        else{
            System.out.println("Sorry no can do");
        }
*/


        System.out.printf("Choose one or two: ");
        int num = scanner.nextInt();


        switch (num) {
            case 1:
                System.out.println("you entered one");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

    }
}
