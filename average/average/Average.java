package average;

import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average;

        System.out.println("Enter the value of average:");
        average = scanner.nextDouble();

        if(average >= 9.0){
            System.out.println("A");
        }else if(average >= 8.0){
            System.out.println("B");
        }else if(average >= 7.0){
            System.out.println("C");
        }else if(average >= 6){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

        scanner.close();
    }
}