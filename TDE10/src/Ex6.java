import java.util.Scanner;
import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> folha = new ArrayList<>();

        System.out.println("Quantos funcionários?");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Salário Base: ");
            double salarioBase = sc.nextDouble();
            System.out.println("É gerente? (s/n)");
            String gerente = sc.next();

            if (gerente.equalsIgnoreCase("s")) {
                System.out.println("Bônus: ");
                double bonus = sc.nextDouble();
                folha.add(new Gerente(nome, salarioBase, bonus));
            }
            else {
                folha.add(new Funcionario(nome, salarioBase));
            }
        }
        System.out.println("\n=== FOLHA ===\n");
        double total = 0;

        for (Funcionario func : folha) {
            System.out.printf("%s: %.2f%n", func.getNome(), func.salario());
            total += func.salario();
        }
        System.out.printf("Total: R$%.2f%n", total);
    }
}
