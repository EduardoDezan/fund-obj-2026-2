
public class Ex1 {
    public static void main(String[] args) {
        Produto produto = new Produto("Sacola", 100);
        produto.setPreco(-100);
        System.out.printf("%s: R$%.2f%n", produto.getNome(), produto.getPreco());
        produto.setPreco(50);
        System.out.printf("%s: R$%.2f%n", produto.getNome(), produto.getPreco());
    }
}
