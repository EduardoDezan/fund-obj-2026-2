interface Identificavel {
    String identificacao();
}

class Cliente implements Identificavel {
    String nome, cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String identificacao() { return String.format("Nome: %s (CPF: %s)", nome, cpf); }
}