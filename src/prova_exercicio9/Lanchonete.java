package prova_exercicio9;

public class Lanchonete {

    public double calcularValorTotal(int codigoProduto, int quantidade) {
        double precoUnitario;
        switch (codigoProduto) {
            case 1:
                precoUnitario = 5.00;
                break;
            case 2:
                precoUnitario = 3.50;
                break;
            case 3:
                precoUnitario = 4.80;
                break;
            case 4:
                precoUnitario = 8.90;
                break;
            case 5:
                precoUnitario = 7.32;
                break;
            default:
                throw new IllegalArgumentException("codigo de produto invalido.");
        }
        return precoUnitario * quantidade;
    }
}