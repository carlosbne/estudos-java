package condicinais;

import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int desconto = ( x < 1000) ? x - 50 : x - 80;

        System.out.println(desconto);
        
        sc.close();
    }
}
