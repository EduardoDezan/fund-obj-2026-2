import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] apelido = original;

        apelido[0] = 10;

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Apelido: " + Arrays.toString(apelido));
    }
}
