
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a palavra:");
        String palavra = sc.nextLine();
        String palavraInv = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(palavraInv)) {
            System.out.println("É um palíndromo!");
        }
        else {
            System.out.println("Não é um palíndromo!");
        }
    }
}
