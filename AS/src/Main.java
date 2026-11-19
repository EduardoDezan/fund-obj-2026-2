
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro(1, "Veloster", 100);
        Moto moto = new Moto(2, "Vespa", 50);

        mostrarOrcamento(carro, 3);
        mostrarOrcamento(moto, 3);

        System.out.printf("%nPosso alugar o carro? %b%n", carro.alugar());
        System.out.printf("Posso alugar o carro? %b%n", carro.alugar());
        System.out.printf("Posso devolver o carro? %b%n", carro.devolver());
        System.out.printf("Posso devolver o carro? %b%n", carro.devolver());

        System.out.printf("%nalterarValorDiaria(0) na moto? %b%n", moto.alterarValorDiaria(0));
        System.out.printf("alterarValorDiaria(-10) na moto? %b%n%n", moto.alterarValorDiaria(-10));

        carro.alterarValorDiaria(120);
        System.out.printf("Diária de 3 dias: %.2f%n", carro.calcularValor(3));
    }

    public static void mostrarOrcamento(Tarifavel item, int dias) {
        System.out.println(item.calcularValor(dias));
    }
}

