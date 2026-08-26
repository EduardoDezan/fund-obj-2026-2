
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase:");
        String frase = sc.nextLine();

        System.out.println("Caracteres: " + frase.length());
        System.out.println("Todo maiúsculo: " + frase.toUpperCase());
    }
}
