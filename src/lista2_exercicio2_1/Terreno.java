package lista2_exercicio2_1;

public class Terreno {
    private double largura;
    private double comprimento;
    private double valorMetroQuadrado;

    public Terreno(double largura, double comprimento, double valorMetroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    public double calcularArea() {
        return largura * comprimento;
    }

    public double calcularPreco() {
        return calcularArea() * valorMetroQuadrado;
    }
}