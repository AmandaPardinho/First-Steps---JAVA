package areacalculation;
import java.util.Scanner;

public class Square{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int areaSquare;
        int side = 0;

        System.out.println("Enter the value of the side of the square (meters):");
        side = scanner.nextInt();

        areaSquare = side * side;

        System.out.println("The area of the square is " + areaSquare + " m².");

        scanner.close();
    }
}