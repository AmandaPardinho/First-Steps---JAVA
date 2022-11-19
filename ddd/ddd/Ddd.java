package ddd;

import java.util.Scanner;

public class Ddd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ddd = scanner.nextInt();

        switch(ddd){
            case 11:
                System.out.println("São Paulo");     
                break;
            case 19:
                System.out.println("Campinas");    
                break;
            case 21:
                System.out.println("Rio de Janeiro");     
                break;
            case 27:
                System.out.println("Vitória");     
                break;
            case 31:
                System.out.println("Belo Horizonte");     
                break;
            case 32:
                System.out.println("Juíz de Fora");     
                break;    
            case 61:
                System.out.println("Brasília");
                break;    
            case 71:
                System.out.println("Salvador");    
                break;
            default:
                System.out.println("Unregistered area code");    
        }

        scanner.close();
    }
}