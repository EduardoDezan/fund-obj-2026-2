
class Termometro {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return celsius * 9/5 + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
