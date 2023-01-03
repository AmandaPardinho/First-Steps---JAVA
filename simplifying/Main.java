package display.simplifying;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
            Rewrite the following code in order to use as few lines as possible.
            Note(s): Heaping lines does not solve the problem. The following code is not simplification, it is 
            confusion. 
            int x = 0; x = System.out.println("Enter a number");         
            """);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        System.out.println("You entered the number " + x);

        scanner.close();
    }
}