import java.util.ArrayList;
class Pedido {
    private ArrayList<Item> items = new ArrayList<>();

    void adicionar(Item item) {
        items.add(item);
    }

    double total() {
        double soma = 0;
        for (Item item : items) soma += item.preco;
        return soma;
    }
}
