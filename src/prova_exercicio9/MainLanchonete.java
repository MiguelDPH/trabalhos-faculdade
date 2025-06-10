package prova_exercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lanchonete lanchonete = new Lanchonete();

        try {
            System.out.print("codigo do produto comprado: ");
            int codigo = sc.nextInt();

            System.out.print("quantidade comprada: ");
            int quantidade = sc.nextInt();

            double valorTotal = lanchonete.calcularValorTotal(codigo, quantidade);
            System.out.printf("valor a pagar: %.2f%n", valorTotal);

        } catch (InputMismatchException e) {
            System.out.println("entrada inválida, verifique os tipos de entrada (inteiro para código e quantidade).");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}