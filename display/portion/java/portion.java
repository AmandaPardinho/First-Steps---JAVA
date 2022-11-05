package display.portion.java;

import java.io.IOException;
import java.util.*;

public class Portion {
 
    public static void main(String[] args) throws IOException {
 
        Integer curupira = 300;
        Integer boitata = 1500;
        Integer boto = 600;
        Integer mapinguari = 1000;
        Integer iara = 150;
        Integer[] cassava = {300, 1500, 600, 1000, 150};

        Scanner scanner = new Scanner(System.in);

        Integer sum = cassava[0] + cassava[1] + cassava[2] + cassava[3] + cassava[4];
        System.out.println("Dona Chica will need " + sum + " g of cassava");
    }
}