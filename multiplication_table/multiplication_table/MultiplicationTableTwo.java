package multiplication_table;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 1;

        do{
            System.out.println(number * counter);
            counter++;
        }while(counter <= 10);

        scanner.close();
    }    
}
