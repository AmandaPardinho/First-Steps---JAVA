package multiplication_table;

import java.util.Scanner;

public class MultiplicationTableOne{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 1;

        while(counter <= 10){
            System.out.println(number * counter);
            counter++;    
        }

        scanner.close();
    }
}