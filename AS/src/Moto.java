
public class Moto extends Veiculo {
    public Moto(int codigo, String modelo, double valorDiaria) {
        super(codigo, modelo, valorDiaria);
    }

    @Override
    public double calcularValor(int dias) {
        double diaria = getValorDiaria();
        if (dias > 0 && diaria > 0) return diaria * dias + 5;
        else return 0;
    }
}
