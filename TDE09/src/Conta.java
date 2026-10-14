
class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }
    public boolean sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            return true;
        }
        else return false;
    }

}
