package reversingnumbers;

import java.util.Scanner;

public class NewResolution {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            Enter a number greater than or equal to 100 and less than 1000 and invert it
                """);

        int originalNumber;
        int cent;
        int tenUnits;
        int unit;
        int newNumber;
        int rest1;

        System.out.println("Enter a number:");
        originalNumber = scanner.nextInt();

        cent = originalNumber / 100;
        rest1 = originalNumber % 100;
        tenUnits = rest1 / 10;
        unit = rest1 % 10;
        
        newNumber = (unit * 100) + (tenUnits * 10) + cent;

        System.out.println("The new reverse number is: " + newNumber);

        scanner.close();
    }
    
}
