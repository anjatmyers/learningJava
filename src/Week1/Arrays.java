package Week1;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] b = {75, 38, 21, 56, 5431, 78, 88, 456, 99};

//        System.out.println(b[4]);

//        for (int i = 0; i < b.length; i++){
//            System.out.println(b[i]);
//        }

//        will print array in reverse
//        for (int i = b.length - 1; i >= 0; i--){
//            System.out.println(b[i]);
//        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < b.length; i++){
            if ( b[i] > 100){
                count++;
            }
            sum = sum + b[i];
        }
//        System.out.println(count);
//        System.out.println((double)sum/b.length);


        double[] foo = {9.0, 4.3, 2.5, 6.1, 8.9};
        double[] bar = new double[3];

        String[] predictions = new String[3];
        predictions[0] = "a pioneer";
        predictions[1] = "loved by many";
        predictions[2] = "very wealthy";


        Scanner scanner = new Scanner(System.in);
//        System.out.println("pick one two or three");
//        int choice = scanner.nextLine();


//        for EACH LOOP




//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int x : arr){
//            System.out.println(x);
//        }

//        int[] newArr = new int [20];
//        for(int i=0; i < 20; i++){
//            newArr[i] = i+1;
//        }
//
//        for(int x : newArr){
//            System.out.println(x);
//        }



        double[] doubleArr = {2.3, 4.3, 5.5, 6.6, 1.1};
        double count2 = 0.0;
        for(double x : doubleArr) {
            count2 = count2 + x;

        }

//        System.out.println(count2);
//        System.out.println((double)count2/doubleArr.length);

        String[] foods = new String[3];
        System.out.println("Type your top five fav foods");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();
        System.out.println("No more memory available");

        foods[0] = input1;
        foods[1] = input2;
        foods[2] = input3;
        System.out.println("Your favorite foods include:");
        for(String x : foods){
            System.out.println(x);
        }





    }
}
