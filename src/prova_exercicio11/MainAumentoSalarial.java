package prova_exercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAumentoSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("digite o salario da pessoa: ");
            double salario = sc.nextDouble();

            CalculadoraSalario calculadora = new CalculadoraSalario(salario);

            double novoSalario = calculadora.calcularNovoSalario();
            double aumento = calculadora.calcularAumento();
            int porcentagem = calculadora.getPorcentagemAumento();

            System.out.printf("novo salario R$ %.2f%n", novoSalario);
            System.out.printf("aumento R$ %.2f%n", aumento);
            System.out.printf("porcentagem = %d%%%n", porcentagem);

        } catch (InputMismatchException e) {
            System.out.println("digite um número decimal para o salário.");
        }
    }
}