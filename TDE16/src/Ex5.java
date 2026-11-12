import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Pagavel> pagaveis = new ArrayList<>();
        pagaveis.add(new Funcionario("", "", 2500));
        pagaveis.add(new Conta(12.49));

        double total = 0;
        for (Pagavel pagavel : pagaveis) {
            total += pagavel.valorAPagar();
        }
        System.out.printf("Total a pagar: R$%.2f%n", total);
    }
}
