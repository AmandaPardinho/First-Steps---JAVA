package legs;

import java.util.Scanner;
public class Legs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of legs:");
        int legs = scanner.nextInt();

        switch (legs) {
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Biped");
                break;
            case 4:
                System.out.println("Quadruped");
                break;
            case 8:
                System.out.println("Spider");
                break;
            default:
                System.out.println("ET");
        }

        scanner.close();
    }
}
