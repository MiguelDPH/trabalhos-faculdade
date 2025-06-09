package exercicio2_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExercicio2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrizQuadradaUtils matrizUtils = new MatrizQuadradaUtils();

        try {
            System.out.print("Digite a ordem da matriz quadrada (n): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("A ordem da matriz deve ser maior que zero.");
                return;
            }

            int[][] matriz = new int[n][n];

            System.out.println("Preencha a matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nMatriz criada:");
            matrizUtils.imprimirMatriz(matriz);

            int somaPrincipal = matrizUtils.somaDiagonalPrincipal(matriz);
            int somaSecundaria = matrizUtils.somaDiagonalSecundaria(matriz);

            System.out.println("\nSoma da diagonal principal: " + somaPrincipal);
            System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite números inteiros.");
        } finally {
            scanner.close();
        }
    }
}