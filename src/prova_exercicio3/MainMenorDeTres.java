package prova_exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComparadorDeNumeros comparador = new ComparadorDeNumeros();

        try {
            System.out.print("primeiro valor: ");
            int n1 = sc.nextInt();

            System.out.print("segundo valor: ");
            int n2 = sc.nextInt();

            System.out.print("terceiro valor: ");
            int n3 = sc.nextInt();

            int menor = comparador.encontrarMenor(n1, n2, n3);
            System.out.println("menor = " + menor);

        } catch (InputMismatchException e) {
            System.out.println("digite numeros inteiros");
        }
    }
}