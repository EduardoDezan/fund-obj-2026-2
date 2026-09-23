
public class Ex2 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Saldo atual: " + conta.saldo);
        conta.depositar(42);
        System.out.println("Saldo atual: " + conta.saldo);
        conta.sacar(30);
        System.out.println("Saldo atual: " + conta.saldo);
        conta.sacar(13);
    }
}
