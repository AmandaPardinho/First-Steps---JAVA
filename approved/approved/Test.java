package approved;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1;
        double n2;
        double average;

        System.out.println("Enter n1:");
        n1 = scanner.nextDouble();
        System.out.println("Enter n2:");
        n2 = scanner.nextDouble();

        average = (n1 + n2) / 2;

        System.out.println("Your final average is " + average);

        if(average >= 6){
            System.out.println("Congratulations!!! You've beeen approved!");    
        }else{
            System.out.println("Sorry, you didn't make it. Good luck in the exam.");
        }

        scanner.close();
    }
}