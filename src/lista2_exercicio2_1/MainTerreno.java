package lista2_exercicio2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a largura do terreno: ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do terreno: ");
            double comprimento = sc.nextDouble();

            System.out.print("Digite o valor do metro quadrado: ");
            double valorMetroQuadrado = sc.nextDouble();

            Terreno terreno = new Terreno(largura, comprimento, valorMetroQuadrado);

            double area = terreno.calcularArea();
            double preco = terreno.calcularPreco();

            System.out.printf("Area do terreno = %.2f%n", area);
            System.out.printf("Preco do terreno = %.2f%n", preco);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
        }
    }
}