package average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float average = (n1 + n2) / 2;

        System.out.println("Your average was " + average);

        if (average >= 9){
            System.out.println("Congratulations!!!");
        }

        scanner.close();
    }
}
