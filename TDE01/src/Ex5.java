import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma temperatura: ");
        double celsius = sc.nextDouble();

        double fahren = celsius * 9 / 5 + 32;
        System.out.printf("%.1f°C = %.1f°F", celsius, fahren);
    }
}
