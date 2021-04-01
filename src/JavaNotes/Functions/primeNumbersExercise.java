package JavaNotes.Functions;

import java.util.Scanner;

public class primeNumbersExercise {

    public static void main(String[] args) {



        for (int num = 2; num < 10000; num ++){
            boolean isPrime = true;

            for (int div = 2; div * div <= num; div++){
                if(num % div == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }

        }







    }
}
