import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        
        //m
        Locale.setDefault(Locale.US);
        int y = 32;
        double x = 10.35784;

        int idade = 31;
        double renda = 4000;
        String nome = "Maria";

        System.out.println("Bom dia!");
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);
        System.out.println(y);

        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f Metros\n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
        
    }
}