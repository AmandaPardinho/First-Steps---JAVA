package selection_test;

import java.util.Scanner;

public class SelectionTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        if((B > C) && (D > A) && ((C + D) > (A + B)) && ((C > 0) && (D > 0)) && (A % 2 == 0)){
            System.out.println("Accepted values");
        }else{
            System.out.println("Values not accepted");
        }

        scanner.close();
    }
}