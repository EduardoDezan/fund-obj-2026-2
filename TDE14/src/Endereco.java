class Endereco {
    String rua;
    int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String toString() {
        return rua + ", " + "N°" + numero;
    }
}
