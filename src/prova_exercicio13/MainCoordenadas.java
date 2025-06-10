package prova_exercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCoordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("valor de X: ");
            double x = sc.nextDouble();

            System.out.print("valor de Y: ");
            double y = sc.nextDouble();

            PontoCartesiano ponto = new PontoCartesiano(x, y);
            System.out.println(ponto.determinarQuadrante());

        } catch (InputMismatchException e) {
            System.out.println("digite números decimais para as coordenadas.");
        }
    }
}