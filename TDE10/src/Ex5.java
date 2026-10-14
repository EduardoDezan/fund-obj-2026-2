public class Ex5 {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(1000);
        conta.renderJuros(0.1);
        System.out.println("Saldo: R$" + conta.getSaldo());
    }
}
