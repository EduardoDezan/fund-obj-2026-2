import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        final double COTACAO = 5.40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Valor em reais: ");
        double reais = sc.nextDouble();
        double dolar = reais / COTACAO;
        System.out.printf("R$%.2f = U$%.2f%n", reais, dolar);

    }
}
