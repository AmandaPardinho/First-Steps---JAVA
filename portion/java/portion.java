package display.portion.java;

;

import java.io.IOException;
import java.util.*;

public class portion {
 
    public static void main(String[] args) throws IOException {
 
        Integer curupira = 300;
        Integer boitata = 1500;
        Integer boto = 600;
        Integer mapinguari = 1000;
        Integer iara = 150;
        Integer i;
        Integer sum = 0;

        Scanner scanner = new Scanner(System.in);

        List<Integer> cassava = new ArrayList<>();
        for(i = 0; i <= 5; i++){
            cassava.add(scanner.nextInt());
        }

        for(Integer n: cassava){
            sum += n.intValue();
            System.out.println(sum);
        }

    }
 
}