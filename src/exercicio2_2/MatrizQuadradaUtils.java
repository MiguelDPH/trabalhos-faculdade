package exercicio2_2;

public class MatrizQuadradaUtils {

    public int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public int somaDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            soma += matriz[i][n - 1 - i];
        }
        return soma;
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}