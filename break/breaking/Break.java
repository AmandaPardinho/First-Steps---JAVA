package breaking;

import java.util.Scanner;

public class Break{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Counter = " + i);
            if(i == 5){
                break;
            }
        }
        
        System.out.println("End of program");

        scanner.close();
    }
}