package exercicio1_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExercicio1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Opção: ");

        try {
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = conversor.celsiusParaFahrenheit(celsius);
                System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit%n", celsius, fahrenheit);
            } else if (opcao == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = conversor.fahrenheitParaCelsius(fahrenheit);
                System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius%n", fahrenheit, celsius);
            } else {
                System.out.println("Opção inválida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        }
    }
}