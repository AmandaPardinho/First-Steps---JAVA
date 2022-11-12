package age;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = scanner.nextInt();
        int age = 2022 - birthYear;

        if(age >= 18){
            System.out.println("Older");
        }else{
            System.out.println("Underage");
        }

    }
}
