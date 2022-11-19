package range;

import java.util.Scanner;

public class Range{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value;
        value = scanner.nextDouble();

        if(value >= 0.0 && value <= 25.0){
            System.out.println("Range [0 , 25]");
        }else if(value > 25.0 && value <= 50.0){
            System.out.println("Range (25, 50]");
        }else if(value > 50.0 && value <= 75.0){
            System.out.println("Range (50 , 75]");
        }else if(value > 75.0 && value <= 100.0){
            System.out.println("Range (75, 100]");
        }else{
            System.out.println("Out of range");
        }

        scanner.close();
    }
}