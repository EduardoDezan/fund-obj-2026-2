class Funcionario {
    private String nome;
    private double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    double salario() {
        return salarioBase;
    }
}
class Gerente extends Funcionario {
    private double bonus;

    Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override double salario() {
        return super.salario() + bonus;
    }
}
