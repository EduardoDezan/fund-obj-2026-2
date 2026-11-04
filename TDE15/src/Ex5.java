import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado(4));
        formas.add(new Retengulo(6, 3));
        double total = 0;
        for (Forma forma : formas) {
            total += forma.area();
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
