class Veiculo {
    protected String marca;

    Veiculo(String marca) { this.marca = marca; };

    String descricao() {
        return "Veículo da marca " + marca;
    }
}
class Carro extends Veiculo {
    private int portas;

    Carro(String marca, int portas) {
        super(marca);
        this.portas = portas;
    }
    @Override String descricao() {
        return super.descricao() + ", com " + portas + " portas.";
    }
}
