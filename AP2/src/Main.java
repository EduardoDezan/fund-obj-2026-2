
public class Main {
    public static void main(String[] args) {

        // Passo 1
        Banco bancoUlbra = new Banco("Banco Ulbra");

        // Passo 2
        Conta conta = new Conta(120, "José");
        ContaPoupanca contaPoup = new ContaPoupanca(121, "Ana", 0.05);
        ContaCorrente contaCorr = new ContaCorrente(122, "Fodrigo Raro", 500.0);

        // Passo 3
        bancoUlbra.adicionarConta(conta);
        bancoUlbra.adicionarConta(contaPoup);
        bancoUlbra.adicionarConta(contaCorr);

        // Passo 4
        System.out.println("Depósito 0");
        conta.depositar(0);

        System.out.println("Depósito 200");
        contaPoup.depositar(200);
        System.out.printf("Saque 100 permitido? %b%n", contaPoup.sacar(100));
        // Passo 5
        System.out.printf("Saque 101 permitido? %b%n", contaPoup.sacar(101));
        // Passo 6
        System.out.printf("Saldo antes do rendimento: R$%.2f%n", contaPoup.getSaldo());
        contaPoup.aplicarRendimento();
        System.out.printf("Saldo com rendimento de %.2f: R$%.2f%n", contaPoup.getTaxaRendimento(), contaPoup.getSaldo());

        System.out.println("Depósito 500");
        contaCorr.depositar(500);
        // Passo 7
        System.out.printf("Saque 1000 permitido? %b%n", contaCorr.sacarComLimite(1000));
        System.out.printf("Saque 1 permitido? %b%n%n", contaCorr.sacarComLimite(1));

        // Passo 8
        System.out.println("CONTAS LISTADAS");
        bancoUlbra.listarContas();

        System.out.println("SALDO TOTAL");
        System.out.println(bancoUlbra.saldoTotal());

        Conta contaEncontrada = bancoUlbra.buscarPorNumero(123);
        if (contaEncontrada != null) System.out.println(contaEncontrada.getNumero());
        else System.out.println("\nConta inexistente!");
    }
}