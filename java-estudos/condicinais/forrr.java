package condicinais;

import java.util.Scanner;

public class forrr {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // quantidade de repetições

        int soma = 0;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);


    }
    
}
