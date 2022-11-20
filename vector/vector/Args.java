package vector;

import java.util.Scanner; //+

public class Args{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //+

        System.out.println("Parameters passed on the command line: ");

        //"i" is the position number
        for(int i = 0; i < args.length; i++){
            System.out.println("Parameters " + i + " = " + args[i]);
        }
        scanner.close(); //+

        //+Depending on the program, this method may make it unnecessary to use the Scanner
    }
}