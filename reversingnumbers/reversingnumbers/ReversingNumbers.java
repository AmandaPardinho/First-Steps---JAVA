package reversingnumbers;

import java.util.Scanner;

public class ReversingNumbers{
    public static void main(String[] args) {
        
        //Entrar com um número maior ou igual a 100 e menor que 1000 e invertê-lo
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        System.out.println("""
            Enter a number greater than or equal to 100 and less than 1000 and invert it
                """);
            
        String number;
        System.out.println("Enter a number:");
        number = scanner.nextLine();
        builder.append(number);

        System.out.println("The number typed was " + number + " and its inverse is " + builder.reverse());

        scanner.close();
    }
}