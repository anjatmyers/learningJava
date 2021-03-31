package Week1.Functions;

import java.util.Scanner;

public class methodsIntro {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println(50);
//        System.out.println(100);
        System.out.println(car());
        System.out.println(add(13, 6));

    }

    public static void foo(){
        System.out.println(30);
        int var;
        var = 5;
        bar(var, 57.5, "carmel");


    }

    public static void bar(int a, double b, String c){
        System.out.println(a + " " + b + " " + c);

    }


    public static int car(){
        return 49;
    }

    public static int add(int a, int b){
        return a + b;
    }

    int[] x = {3, 4, 5, 6, 7};
//    public static void boo(int[] c){
//        return c;
//    }



}
