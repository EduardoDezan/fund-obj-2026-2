import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Operações: D valor | S valor | F finalizar");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("F")) break;

            double valor = sc.nextDouble();
            if (input.equalsIgnoreCase("D")) conta.depositar(valor);

            else if (input.equalsIgnoreCase("S")) {
                if (!conta.sacar(valor)) System.out.println("Saque negado!");
            }
        }
        System.out.printf("Saldo final: %.2f%n", conta.getSaldo());
    }
}
