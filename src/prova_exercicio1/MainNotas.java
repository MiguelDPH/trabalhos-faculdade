package prova_exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            Aluno aluno = new Aluno(nota1, nota2);

            double notaFinal = aluno.calcularNotaFinal();
            System.out.printf("nota final = %.1f%n", notaFinal);

            String status = aluno.verificarAprovacao();
            if (status.equals("reprovado")) {
                System.out.println(status);
            }

        } catch (InputMismatchException e) {
            System.out.println("digite um número decimal para as notas.");
        }
    }
}