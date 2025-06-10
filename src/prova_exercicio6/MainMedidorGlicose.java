package prova_exercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMedidorGlicose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("digite a medida da glicose: ");
            double glicose = sc.nextDouble();

            MedidorGlicose medidor = new MedidorGlicose(glicose);
            System.out.println("classificacao: " + medidor.classificarGlicose());

        } catch (InputMismatchException e) {
            System.out.println("digite um número decimal.");
        }
    }
}