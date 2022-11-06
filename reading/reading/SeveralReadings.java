package reading;

import java.util.Scanner;

public class SeveralReadings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;

        System.out.println("Enter your name");
        text = scanner.nextLine();

        System.out.println("Your name is " + text);

        int code;
        double price;
        String name, type1, type2;

        System.out.println("Enter the code:");
        type1 = scanner.nextLine();
        code = Integer.parseInt(type1);

        System.out.println("Enter price:");
        type2 = scanner.nextLine();
        price = Double.parseDouble(type2);

        System.out.println("Enter name:");
        name = scanner.nextLine();

        //System.out.println("You typed " + name + " R$ " + price + " code " + code);
        
        System.out.printf("You typed %d, %s, R$ %.2f\n", code, name, price);

    }
}
