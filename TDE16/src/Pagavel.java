interface Pagavel {
    double valorAPagar();
}

class Conta implements Pagavel {
    double valor;
    public Conta(double valor) { this.valor = valor; }

    public double valorAPagar() { return valor; }
}
