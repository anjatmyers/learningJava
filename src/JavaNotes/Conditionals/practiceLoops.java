package JavaNotes.Conditionals;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class practiceLoops {

    public static void main(String[] args) {




//        for(int i = 89; i <= 117; i++){
//            System.out.println(i);
//        }


//        for(int i = 1; i <= 40; i++){
//
//            if(i % 4 == 0){
//                System.out.println("Quack");
//                continue;
//            }
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 10; i++){
//
//            System.out.println(i);
//        }


        Scanner scanner = new Scanner(System.in);
//        String pw;
//        do {
//            System.out.print("Please Enter Your Password:");
//            pw = scanner.next();
//
//        } while(!pw.equals("shark50"));
//        System.out.println("ACCESS GRANTED");



        int num = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int i = 0;

        do {
            System.out.println("Guess a number from 1-100:");
            guess = scanner.nextInt();

            if(guess < num){
                System.out.println("Nope. Try Higher.");
                i++;
            }
            else if(guess > num){
                System.out.println("Nope. Try Lower.");
                i++;
            }
            else if (guess == num){
                i++;
                System.out.println("You got it! It was " + num + "!");
                System.out.println("It took you " + i + " guesses to get it.");
            }
        } while (guess != num);





    }
}
