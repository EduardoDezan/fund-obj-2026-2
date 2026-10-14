
public class Ex4 {
    public static void main(String[] args) {
        Termometro tr = new Termometro();
        tr.setCelsius(69);
        System.out.printf("%.1f°C = %.1f°F%n", tr.getCelsius(), tr.getFahrenheit());
    }
}
