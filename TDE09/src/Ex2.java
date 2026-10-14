
public class Ex2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana");
        pessoa.setIdade(-30);
        pessoa.setIdade(30);
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
