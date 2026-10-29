public class Ex5 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionar(new Item("Café", 8));
        pedido.adicionar(new Item("Torrada", 6));

        System.out.printf("Total: R$%.2f%n", pedido.total());
    }
}
