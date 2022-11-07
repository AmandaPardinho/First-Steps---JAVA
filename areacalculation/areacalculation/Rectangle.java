package areacalculation;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int areaRetangle;
        int height;
        int width;

        System.out.println("Enter the value of width of the rectangle (meters):");
        width = scanner.nextInt();

        System.out.println("Enter the value of height of the rectangle (meters):");
        height = scanner.nextInt();

        areaRetangle = height * width;

        System.out.println("The area of the rectangle is " + areaRetangle + " m².");

        scanner.close();
    }
    
}
