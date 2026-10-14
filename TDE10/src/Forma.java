class Forma {
    double area() {
        return 0;
    }
}
class Quadrado extends Forma {
    private double lado;

    Quadrado(double lado) {this.lado = lado;}

    @Override double area() {
        return lado * lado;
    }
}
class Circulo extends Forma {
    private double raio;

    Circulo(double raio) {this.raio = raio;}

    @Override double area() {
        return 3.14159 * raio * raio;
    }
}