package exercicio3_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExercicio3_2 {

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
        System.out.println("Dentro do método trocarValores:");
        System.out.println("refA.valor agora é: " + refA.valor);
        System.out.println("refB.valor agora é: " + refB.valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor para objA: ");
            int valorA = scanner.nextInt();
            ValorContainer objA = new ValorContainer(valorA);

            System.out.print("Digite o valor para objB: ");
            int valorB = scanner.nextInt();
            ValorContainer objB = new ValorContainer(valorB);

            System.out.println("\nValores antes da troca:");
            System.out.println("objA.valor: " + objA.valor);
            System.out.println("objB.valor: " + objB.valor);
            System.out.println("Hashcode de objA: " + System.identityHashCode(objA));
            System.out.println("Hashcode de objB: " + System.identityHashCode(objB));


            trocarValores(objA, objB);

            System.out.println("\nValores após a troca:");
            System.out.println("objA.valor: " + objA.valor);
            System.out.println("objB.valor: " + objB.valor);
            System.out.println("Hashcode de objA (permanece o mesmo): " + System.identityHashCode(objA));
            System.out.println("Hashcode de objB (permanece o mesmo): " + System.identityHashCode(objB));

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}