package prova_exercicio7;

public class LancamentoDardo {

    public double encontrarMaiorDistancia(double d1, double d2, double d3) {
        double maior = d1;
        if (d2 > maior) {
            maior = d2;
        }
        if (d3 > maior) {
            maior = d3;
        }
        return maior;
    }
}