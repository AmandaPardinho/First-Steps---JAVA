package breaking;

import java.util.Scanner;

public class Ignore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println("Counter = " + i);
        }

        System.out.println("End of program");
        
        scanner.close();
    }
}
