public class Teste {
    public static void main(String[] args) {
        // A referencia e Veiculo; os objetos reais sao Carro e Moto.
        Veiculo carro = new Carro(1, "Onix", 100);
        Veiculo moto = new Moto(2, "Biz", 50);
        System.out.println("=== 1. DADOS E ESTADO INICIAL ===");
        exibir(carro);
        exibir(moto);
        conferir("Dados do carro", carro.getCodigo() == 1
                && carro.getModelo().equals("Onix")
                && carro.getValorDiaria() == 100);
        conferir("Dados da moto", moto.getCodigo() == 2
                && moto.getModelo().equals("Biz")
                && moto.getValorDiaria() == 50);
        conferir("Carro disponivel", carro.isDisponivel());
        conferir("Moto disponivel", moto.isDisponivel());
        System.out.println("\n=== 2. ORCAMENTOS E POLIMORFISMO ===");
        conferir("Carro: 3 dias = 320", carro.calcularValor(3) == 320);
        conferir("Moto: 3 dias = 155", moto.calcularValor(3) == 155);
        mostrarOrcamento(carro, 3); // Esperado: 320.00
        mostrarOrcamento(moto, 3);  // Esperado: 155.00
        Tarifavel tarifaCarro = carro;
        Tarifavel tarifaMoto = moto;
        conferir("Contrato Tarifavel: carro", tarifaCarro.calcularValor(3) == 320);
        conferir("Contrato Tarifavel: moto", tarifaMoto.calcularValor(3) == 155);
        conferir("Orcamentos preservam estado inicial",
                carro.isDisponivel() && moto.isDisponivel());
        System.out.println("\n=== 3. DIAS INVALIDOS ===");
        conferir("Carro: 0 dia", carro.calcularValor(0) == 0);
        conferir("Carro: -1 dia", carro.calcularValor(-1) == 0);
        conferir("Moto: 0 dia", moto.calcularValor(0) == 0);
        conferir("Moto: -1 dia", moto.calcularValor(-1) == 0);
        conferir("Dias invalidos preservam disponibilidade",
                carro.isDisponivel() && moto.isDisponivel());
        System.out.println("\n=== 4. ALUGAR E DEVOLVER ===");
        testarLocacao(carro);
        testarLocacao(moto);
        System.out.println("\n=== 5. ALTERACAO DA DIARIA ===");
        conferir("Diaria zero: false", !carro.alterarValorDiaria(0));
        conferir("Diaria continua 100", carro.getValorDiaria() == 100);
        conferir("Diaria negativa: false", !carro.alterarValorDiaria(-10));
        conferir("Diaria ainda e 100", carro.getValorDiaria() == 100);
        conferir("Diaria 120: true", carro.alterarValorDiaria(120));
        conferir("Diaria atualizada", carro.getValorDiaria() == 120);
        conferir("Novo orcamento: 380", carro.calcularValor(3) == 380);
        conferir("Consulta preserva disponibilidade", carro.isDisponivel());
        exibir(carro);
    }
    public static void mostrarOrcamento(Tarifavel item, int dias) {
        System.out.printf("Orcamento (%d dias): R$ %.2f%n",
                dias, item.calcularValor(dias));
    }
    public static void testarLocacao(Veiculo veiculo) {
        System.out.println("-- " + veiculo.getModelo() + " --");
        exibir(veiculo);
        conferir("Primeiro aluguel: true", veiculo.alugar());
        conferir("Ficou alugado", !veiculo.isDisponivel());
        exibir(veiculo);
        conferir("Segundo aluguel: false", !veiculo.alugar());
        conferir("Continua alugado", !veiculo.isDisponivel());
        exibir(veiculo);
        // Consultar preco tambem nao pode devolver um veiculo alugado.
        mostrarOrcamento(veiculo, 3);
        conferir("Orcamento preserva estado alugado", !veiculo.isDisponivel());
        conferir("Primeira devolucao: true", veiculo.devolver());
        conferir("Ficou disponivel", veiculo.isDisponivel());
        exibir(veiculo);
        conferir("Segunda devolucao: false", !veiculo.devolver());
        conferir("Continua disponivel", veiculo.isDisponivel());
        exibir(veiculo);
    }
    public static void exibir(Veiculo veiculo) {
        System.out.printf("%d | %s | diaria: %.2f | disponivel: %b%n",
                veiculo.getCodigo(), veiculo.getModelo(),
                veiculo.getValorDiaria(), veiculo.isDisponivel());
    }
    public static void conferir(String descricao, boolean resultado) {
        if (resultado) {
            System.out.println("PASSOU: " + descricao);
        } else {
            System.out.println("PENDENTE: " + descricao);
        }
    }
}
