public class Ex4 {
    public static void main(String[] args) {
        Pessoa cara = new Pessoa("Jorge Fodrigues", new Endereco("Rua Salafrários", 1234));
        System.out.printf("%s mora em %s.", cara.nome, cara.endereco.toString());
    }
}
