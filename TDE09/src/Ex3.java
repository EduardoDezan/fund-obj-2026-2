
public class Ex3 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(500);
        System.out.println("Posso sacar 50? " + conta.sacar(50));
        System.out.println("Posso sacar 500? " + conta.sacar(500));
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
