
import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
//        numeros.add(1);
//        numeros.add(2);
//        numeros.add(3);

        System.out.println("Total: " + somaSegura(numeros));
    }
    static int somaSegura(ArrayList<Integer> lista) {
        int total = 0;

        if (lista != null) {
            for (int i : lista) {
                total += 1;
            }
            return total;
        }
        else {
            return 0;
        }
    }
}
