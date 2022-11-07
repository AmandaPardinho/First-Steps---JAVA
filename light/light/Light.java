package light;

import java.util.Scanner;

public class Light{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(""" 
                Knowing that the value of 100 kW corresponds to 1/7 of the minimum wage, make an algorithm that receives the minimum wage and the amount of kW spent by a household and calculate:

                a) The value, in Reais, of each kw.
                b) The amount to be paid.
                c) The new amount to be paid for this residence after a 10% discount.

                Note: the value of the minimum wage today (2022) is R$ 1212.00.
                """);
        
        float totalKw;
        float wage = 1212.0f;
        float amountSpentOne;
        float totalSpentHouse;
        float afterDiscount;

        System.out.println("Enter the number of kW spent this month:");
        totalKw = scanner.nextFloat();

        amountSpentOne = wage / 7 / 100; //total spent with 1 kW

        totalSpentHouse = amountSpentOne * totalKw; //total spent in a given month

        afterDiscount = totalSpentHouse * 0.9f;

        System.out.printf("a) R$ %.2f;\n b) R$ %.2f;\n c) R$ %.2f;\n", amountSpentOne, totalSpentHouse, afterDiscount);

        scanner.close();
    }
}