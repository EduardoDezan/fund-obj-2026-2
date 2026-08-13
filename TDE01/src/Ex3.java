import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double n2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3.0;

        System.out.printf("Média: %.2f%n", media);
    }
}
