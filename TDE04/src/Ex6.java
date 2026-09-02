
import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos preços?");
        int quant = sc.nextInt();

        double[] precos = new double[quant];

        for (int i = 0; i < quant; i++) {
            System.out.printf("%d° Preço: ", i + 1);
            precos[i] = sc.nextDouble();
        }

        aplicarDesconto(precos, 10);
        System.out.println(Arrays.toString(precos));
    }
    static void aplicarDesconto(double[] lista, double percentual)
    {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = lista[i] - (lista[i] * percentual / 100);
        }
    }
}
