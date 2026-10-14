
class Conta {
    protected double saldo;

    double getSaldo() { return saldo; }

    void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }
}
class ContaPoupanca extends Conta {
    void renderJuros(double taxa) {
        saldo += saldo * taxa;
    }
}
