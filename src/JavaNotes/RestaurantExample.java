package JavaNotes;

import java.util.Scanner;

public class RestaurantExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much was your bill?");
        double cost = scanner.nextDouble();

        System.out.println("Split the bill how many ways?");
        int people = scanner.nextInt();

        double costPerPerson = (cost / people);

        System.out.format("Each person will pay %.2f", costPerPerson);
    }

}
