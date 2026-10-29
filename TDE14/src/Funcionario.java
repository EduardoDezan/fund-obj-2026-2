class Funcionario {
    protected String nome;
    protected double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
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
        return salarioBase + bonus;
    }
}
