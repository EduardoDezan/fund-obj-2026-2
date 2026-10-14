public class Ex5 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("salafrário", 1, 10);
        System.out.printf("Nome: %s;%nMédia: %.1f%n", aluno.getNome(), aluno.media());
    }
}
