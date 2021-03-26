package Week1;

public class Variables {
    public static void main(String[] args) {
//        int and double (aka float)
        int x = 10;
        System.out.println(x);

        int expression = 20 / (4 - 2);
        System.out.println(expression);

        double decimal = 4.5;
        System.out.println(decimal - x);

        int y;
        y = 11;

        // java will cut off the decimal unless one of the numbers is written with a decimal
        System.out.println(15.0 / 6);

        // Booleans Char and Strings


        boolean hasLicense = false;
        char userInput = '\u005A';
        char letter = 'A';
        System.out.println(hasLicense);
        System.out.println(userInput);
        System.out.println(letter);

//        type casting
        double foo = 2.95;
        int bar = (int) foo;

        System.out.println(foo);
        System.out.println(bar);
        System.out.println(((double) 17 / 4) );


    }
}
