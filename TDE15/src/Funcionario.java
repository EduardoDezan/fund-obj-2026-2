abstract class Funcionario {
    protected String nome;
    Funcionario(String nome) { this.nome = nome; }

    abstract double salario();

    void contraCheque() {
        System.out.printf("%s: R$%.2f%n", nome, salario());
    }
}

class Horista extends Funcionario {
    private double horas, valorHora;

    public Horista(String nome, double horas, double valorHora) {
        super(nome);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    double salario() {
        return horas * valorHora;
    }
}

class Mensalista extends Funcionario {
    private double fixo;

    public Mensalista(String nome, double fixo) {
        super(nome);
        this.fixo = fixo;
    }

    @Override
    double salario() {
        return fixo;
    }
}
