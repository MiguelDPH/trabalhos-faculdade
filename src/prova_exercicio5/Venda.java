package prova_exercicio5;

public class Venda {
    private double precoUnitario;
    private int quantidadeComprada;
    private double dinheiroRecebido;

    public Venda(double precoUnitario, int quantidadeComprada, double dinheiroRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidadeComprada = quantidadeComprada;
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public double calcularValorTotalProduto() {
        return precoUnitario * quantidadeComprada;
    }

    public double calcularTroco() {
        return dinheiroRecebido - calcularValorTotalProduto();
    }

    public boolean isDinheiroSuficiente() {
        return dinheiroRecebido >= calcularValorTotalProduto();
    }
}