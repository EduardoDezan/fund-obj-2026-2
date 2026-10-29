import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado(3));
        formas.add(new Circulo(1));

        double total = 0;

        for (Forma forma : formas) {
            total += forma.area();
        }

        System.out.printf("Área total: %.2f%n", total);
    }
}
