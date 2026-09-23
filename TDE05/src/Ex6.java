import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        System.out.println("Número de produtos: ");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();
            estoque.add(new Produto(nome, preco));
        }

        System.out.println("\n=== ESTOQUE ===");
        double total = 0;
        for (Produto produto : estoque) {
            System.out.printf("%s - R$%.2f%n", produto.nome, produto.preco);
            total += produto.preco;
        }
        System.out.printf("Total: R$%.2f%n", total);
    }
}
