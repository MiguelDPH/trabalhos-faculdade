package prova_exercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDuracaoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("hora inicial: ");
            int horaInicial = sc.nextInt();

            System.out.print("Hora final: ");
            int horaFinal = sc.nextInt();

            DuracaoJogo jogo = new DuracaoJogo(horaInicial, horaFinal);

            System.out.printf("o jogo durou %d hora(S)%n", jogo.calcularDuracao());

        } catch (InputMismatchException e) {
            System.out.println("digite números inteiros para as horas.");
        }
    }
}