package prova_exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("coeficiente a: ");
            double a = sc.nextDouble();

            System.out.print("coeficiente b: ");
            double b = sc.nextDouble();

            System.out.print("coeficiente c: ");
            double c = sc.nextDouble();

            Bhaskara bhaskara = new Bhaskara(a, b, c);

            if (bhaskara.possuiRaizesReais()) {
                double x1 = bhaskara.calcularX1();
                double x2 = bhaskara.calcularX2();
                System.out.printf("X1 = %.4f%n", x1);
                System.out.printf("X2 = %.4f%n", x2);
            } else {
                System.out.println("esta equacao nao possui raizes reais");
            }

        } catch (InputMismatchException e) {
            System.out.println("erro");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}