package prova_exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTrocoOuFalta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("preço unitario do produto: ");
            double precoUnitario = sc.nextDouble();

            System.out.print("quantidade comprada: ");
            int quantidadeComprada = sc.nextInt();

            System.out.print("dinheiro recebido: ");
            double dinheiroRecebido = sc.nextDouble();

            Venda venda = new Venda(precoUnitario, quantidadeComprada, dinheiroRecebido);

            if (venda.isDinheiroSuficiente()) {
                double troco = venda.calcularTroco();
                System.out.printf("troco = %.2f%n", troco);
            } else {
                double falta = venda.calcularTroco() * -1;
                System.out.printf("falta dinheiro: %.2f REAIS%n", falta);
            }

        } catch (InputMismatchException e) {
            System.out.println("erro, verifique os tipos de entrada.");
        }
    }
}