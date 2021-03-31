package JavaNotes.Conditionals;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class practiceProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int x = 88;
//        int y = 44;
//
//        if ( x > y){
//            System.out.format("%d is bigger than %d", x, y);
//            System.out.printf("\nThe difference is %d", x-y);
//        }
//        else if (y > x){
//            System.out.format("%d is bigger than %d", y, x);
//            System.out.printf("\nThe difference is %d", y-x);
//        }
//        else if ( x == y) {
//            System.out.printf("%d and %d are equal", y, x);
//        }


        int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.print("Pick a number between 1-5:");
        int userNum = scanner.nextInt();

        if(userNum == randomNum){
            System.out.println("You got it! Nice Job!");
        }
        else {
            System.out.print("Nope! Try Again: ");
            int userNum2 = scanner.nextInt();
            if (userNum2 == randomNum){
                System.out.println("You got it! Nice Job!");
            }
            else{
                System.out.printf("Nope! It was %d I win.", randomNum);
            }

        }

    }
}
