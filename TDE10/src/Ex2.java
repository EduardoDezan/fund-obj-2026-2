public class Ex2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 3500, 500);
        System.out.printf("%s: R$%.2f%n", gerente.getNome(), gerente.salario());
    }
}
