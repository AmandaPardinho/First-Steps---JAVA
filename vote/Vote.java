package vote;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year you were born");
        int birthYear = scanner.nextInt();
        int age = 2022 - birthYear;

        if(age < 16){
            System.out.println("Cannot vote");
        }else if((age >= 16 && age < 18) || (age > 70)){
            System.out.println("Voting is optional");
        }else{
            System.out.println("Voting is compulsory");
        }

        scanner.close();
    }
}
