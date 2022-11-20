package square_cube;

import java.util.Scanner;

public class SquareCube{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }  
        
        scanner.close();
    }
}