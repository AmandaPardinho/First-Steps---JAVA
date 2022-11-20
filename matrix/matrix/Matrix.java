package matrix;

import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double matrix[][];
        matrix = new double[3][5]; //rows first; columns second

        //rows = i; columns = j
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.println("Enter the value of the matrix[" + i + "][" + j + "] ="); 
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%10.2f", matrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}