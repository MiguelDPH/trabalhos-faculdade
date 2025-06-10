package prova_exercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLancamentoDardo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LancamentoDardo lancamento = new LancamentoDardo();

        try {
            System.out.println("digite as tres distancias:");
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            double d3 = sc.nextDouble();

            double maiorDistancia = lancamento.encontrarMaiorDistancia(d1, d2, d3);
            System.out.printf("maior distancia = %.2f%n", maiorDistancia);

        } catch (InputMismatchException e) {
            System.out.println("digite números decimais para as distâncias.");
        }
    }
}