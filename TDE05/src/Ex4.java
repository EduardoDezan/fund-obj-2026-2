public class Ex4 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Juguncio", 6.0, 8.0);
        System.out.printf("Aluno: %s%nMédia: %.2f%n", aluno1.nome, aluno1.media());

        Aluno aluno2 = new Aluno("Fabrício");
        System.out.printf("Aluno: %s%nMédia: %.2f%n", aluno2.nome, aluno2.media());
    }
}
