public class Ex3 {
    public static void main(String[] args) {
        imprime(new Funcionario("Ana", 3000));
        imprime(new Gerente("Carlos Adalberto Cardoso Lima Ferreira Santos Silva Januário Quintessentenário Borges", 1, 4));
    }
    static void imprime(Funcionario funcionario) {
        System.out.printf("%s: %.2f%n", funcionario.nome, funcionario.salario());
    }
}
