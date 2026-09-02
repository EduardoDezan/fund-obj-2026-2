import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        mult(numeros);
        System.out.println(Arrays.toString(numeros));
    }
    static void mult(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }
    }
}
