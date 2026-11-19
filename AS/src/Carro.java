
public class Carro extends Veiculo {
    public Carro(int codigo, String modelo, double valorDiaria) {
        super(codigo, modelo, valorDiaria);
    }

    @Override
    public double calcularValor(int dias) {
        double diaria = getValorDiaria();
        if (dias > 0 && diaria > 0) return diaria * dias + 20;
        else return 0;
    }
}
