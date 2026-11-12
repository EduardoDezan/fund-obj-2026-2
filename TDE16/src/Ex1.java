public class Ex1 {
    public static void main(String[] args) {
        Figura[] figuras = { new Quadrado(2), new Circulo(3) };

        for (Figura figura : figuras) {
            System.out.printf("Area: %.2f%n", figura.area());
        }
    }
}
