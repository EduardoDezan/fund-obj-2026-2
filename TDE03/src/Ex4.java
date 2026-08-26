import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.printf("Média: %.2f%n", media(numeros));
    }
    static double media(ArrayList<Integer> lista) {
        int soma = 0;
        for (int i : lista) {
            soma += i;
        }
        return (double) soma / lista.size();
    }
}
