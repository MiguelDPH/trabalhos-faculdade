package prova_exercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerificadorMultiplos verificador = new VerificadorMultiplos();

        try {
            System.out.println("digite dois numeros inteiros:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (verificador.saoMultiplos(num1, num2)) {
                System.out.println("sao multiplos");
            } else {
                System.out.println("nao sao multiplos");
            }

        } catch (InputMismatchException e) {
            System.out.println("digite números inteiros.");
        }
    }
}