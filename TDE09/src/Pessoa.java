
class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) this.idade = idade;
        else System.out.println("Idade inválida!");
    }
}
