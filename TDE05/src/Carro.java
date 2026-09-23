
public class Carro {
    String marca;
    String modelo;
    int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String descricao() {
        return String.format("%s %s (%d)", marca, modelo, ano);
    }
}
