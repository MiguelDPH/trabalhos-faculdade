package prova_exercicio2;

public class Bhaskara {
    private double a;
    private double b;
    private double c;

    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean possuiRaizesReais() {
        return calcularDelta() >= 0;
    }

    public double calcularX1() {
        double delta = calcularDelta();
        if (delta < 0) {
            throw new ArithmeticException("nao possui raizes reais.");
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double calcularX2() {
        double delta = calcularDelta();
        if (delta < 0) {
            throw new ArithmeticException("nao possui raizes reais.");
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}