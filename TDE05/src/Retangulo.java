
public class Retangulo {
    double altura;
    double largura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double area() {
        return largura * altura;
    }
}
