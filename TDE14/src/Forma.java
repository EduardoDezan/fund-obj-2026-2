class Forma {
    double area() { return 0; }
}

class Quadrado extends  Forma {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override double area() {
        return lado * lado;
    }
}

class Circulo extends Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double area() {
        return 3.14 * (raio * raio);
    }
}
