public interface Figura {
    double area();
    double perimetro();
}

class Quadrado implements Figura {
    double lado;
    public Quadrado(double lado) { this.lado = lado; }

    public double area() { return lado * lado; }
    public double perimetro() { return 4 * lado; }
}

class Circulo implements Figura {
    double raio;
    public Circulo(double raio) { this.raio = raio; }

    public double area() { return 3.14 * raio * raio; }
    public double perimetro() { return 2 * 3.14 * raio; }
}

class Retangulo implements Figura {
    double largura; double altura;

    public Retangulo(double base, double altura) {
        this.largura = base;
        this.altura = altura;
    }

    public double area() { return largura * altura; }
    public double perimetro() { return 2 * (largura + altura); }
}
