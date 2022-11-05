package reading;

import java.util.Scanner;

public class Reading{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int integerValue;
        float floatValue;

        System.out.println("Please enter an integer value");
        integerValue = scanner.nextInt();

        System.out.println("Please enter a real value");
        floatValue = scanner.nextFloat();

        System.out.println("You entered the value " + integerValue + " and " + floatValue);

        scanner.close(); //it is good practice to close the scanner at the end of its use in the code
    }
}