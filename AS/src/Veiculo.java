
public abstract class Veiculo implements Tarifavel {
    private int codigo;
    private String modelo;
    private double valorDiaria;
    private boolean disponivel = true;

    public Veiculo(int codigo, String modelo, double valorDiaria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public int getCodigo() { return codigo; }
    public String getModelo() { return modelo; }
    public double getValorDiaria() { return valorDiaria; }
    public boolean isDisponivel() { return disponivel; }

    public boolean alterarValorDiaria(double novoValor) {
        if (novoValor > 0) {
            valorDiaria = novoValor;
            return true;
        }
        else return false;
    }

    public boolean alugar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        else return false;
    }

    public boolean devolver() {
        if (!disponivel) {
            disponivel = true;
            return true;
        }
        else return false;
    }

    @Override
    public double calcularValor(int dias) {
        return valorDiaria * dias;
    }
}
