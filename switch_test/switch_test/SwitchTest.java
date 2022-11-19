package switch_test;

import java.util.Scanner;

public class SwitchTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;

        System.out.println("Enter an integer value between 1 and 10:");
        value = scanner.nextInt();

        switch(value){
            case 1:
                System.out.println("Take a nap");
                break;
            case 2:
                System.out.println("Go eat");
                break;
            case 3:
                System.out.println("Watch TV");    
                break;
            case 4:
                System.out.println("Hang out with your friends");    
                break;
            default:
                System.out.println("Go study");
        }

        scanner.close();
    }
}