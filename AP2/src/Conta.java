class Conta {
    private int numero;
    private String titular;
    protected double saldo;

    public Conta(int numero, String titular)
    {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() { return titular; }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
        else System.out.println("Deve ser maior que zero.");
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        else return false;
    }

    public void exibir() {
        System.out.printf("Número: %d%nTitular: %s%nSaldo: R$%.2f%n%n", numero, titular, saldo);
    }
}

class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() { return taxaRendimento; }

    public void aplicarRendimento() { saldo += saldo * taxaRendimento; }
}

class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public double getLimite() { return limite; }

    public boolean sacarComLimite(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        else return false;
    }
}
