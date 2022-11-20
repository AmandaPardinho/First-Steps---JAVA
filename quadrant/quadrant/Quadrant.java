package quadrant;

import java.util.Scanner;

public class Quadrant{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do{
            x = scanner.nextInt();
            y = scanner.nextInt();

            if(x > 0 && y > 0){
                System.out.println("First quadrant");
            }else if(x < 0 && y > 0){
                System.out.println("Second quadrant");
            }else if(x < 0 && y < 0){
                System.out.println("Third quadrant");
            }else if(x > 0 && y < 0){
                System.out.println("Fourth quadrant");
            }
        }while(x != 0 && y != 0);   

        scanner.close();
    }
}