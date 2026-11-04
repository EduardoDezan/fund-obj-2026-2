abstract class Forma {
    abstract double area();
}

class Quadrado extends Forma {
    private double lado;
    Quadrado(double lado) { this.lado = lado; }

    @Override double area() {
        return lado * lado;
    }
}

class Retengulo extends Forma {
    private double base, altura;
    Retengulo(double base, double altura) { this.base = base; this.altura = altura; }

    @Override double area() {
        return base * altura / 2;
    }
}
