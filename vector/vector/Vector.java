package vector;

import java.util.Scanner;

public class Vector{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double values[];

        values = new double[10];
        //"i" is the position number
        for(int i = 0; i < 10; i++){
            values[i] = scanner.nextDouble();
        }

        for(int i = 0; i < values.length; i++){
            System.out.printf("%.1f ", values[i]);
        }

        scanner.close();
    }
}