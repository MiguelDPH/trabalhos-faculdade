package prova_exercicio11;

public class CalculadoraSalario {
    private double salarioAtual;

    public CalculadoraSalario(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double calcularNovoSalario() {
        return salarioAtual + calcularAumento();
    }

    public double calcularAumento() {
        double porcentagem = getPorcentagemAumento();
        return salarioAtual * (porcentagem / 100.0);
    }

    public int getPorcentagemAumento() {
        if (salarioAtual <= 1000.00) {
            return 20;
        } else if (salarioAtual <= 3000.00) {
            return 15;
        } else if (salarioAtual <= 8000.00) {
            return 10;
        } else {
            return 5;
        }
    }
}