package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /* palavra
         String x = sc.next();


        /* numero inteiro
        int x = sc.nextInt();

        ponto flutuante
        double x = sc.nextDouble();
 */

         /* char x = sc.next().charAt(4); */

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}

