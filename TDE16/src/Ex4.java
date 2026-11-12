import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Quadrado(2));
        figuras.add(new Circulo(2));
        figuras.add(new Retangulo(2, 4));

        double total = 0;
        for (Figura figura : figuras) {
            total += figura.area();
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
