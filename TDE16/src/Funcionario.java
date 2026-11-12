
class Funcionario implements Pagavel, Identificavel {
    String nome, matricula;
    double salario;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public double valorAPagar() { return salario; }
    public String identificacao() { return String.format("Funcionário: %s; (matrícula: %s)", nome, matricula); }
}

