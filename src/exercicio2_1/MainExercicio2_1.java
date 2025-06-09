package exercicio2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExercicio2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrizUtils matrizUtils = new MatrizUtils();

        try {
            System.out.print("Digite o número de linhas da matriz (m): ");
            int m = scanner.nextInt();
            System.out.print("Digite o número de colunas da matriz (n): ");
            int n = scanner.nextInt();

            if (m <= 0 || n <= 0) {
                System.out.println("As dimensões da matriz deve ser maior que zero.");
                return;
            }

            int[][] matriz = new int[m][n];

            System.out.println("Preencha a matriz:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nMatriz criada:");
            matrizUtils.imprimirMatriz(matriz);

            int maior = matrizUtils.encontrarMaiorElemento(matriz);
            int menor = matrizUtils.encontrarMenorElemento(matriz);

            System.out.println("\nMaior elemento na matriz: " + maior);
            System.out.println("Menor elemento na matriz: " + menor);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite números inteiros.");
        } finally {
            scanner.close();
        }
    }
}