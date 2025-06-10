package prova_exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPlanoTelefonia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("digite a quantidade de minutos: ");
            int minutos = sc.nextInt();

            PlanoTelefonia plano = new PlanoTelefonia(minutos);

            double valorPagar = plano.calcularValorFinal();
            System.out.printf("valor a pagar: %.2f%n", valorPagar);

        } catch (InputMismatchException e) {
            System.out.println("digite um número inteiro para os minutos.");
        }
    }
}