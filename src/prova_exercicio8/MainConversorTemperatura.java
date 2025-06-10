package prova_exercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();

        try {
            System.out.print("voce vai digitar a temperatura em qual escala (C/F)? ");
            char escala = sc.next().toUpperCase().charAt(0);

            if (escala == 'C') {
                System.out.print("digite a temperatura em celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = conversor.celsiusParaFahrenheit(celsius);
                System.out.printf("temperatura equivalente em fahrenheit: %.2f%n", fahrenheit);
            } else if (escala == 'F') {
                System.out.print("digite a temperatura em fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = conversor.fahrenheitParaCelsius(fahrenheit);
                System.out.printf("temperatura equivalente em celsius: %.2f%n", celsius);
            } else {
                System.out.println("escala invalida. Digite 'C' ou 'F'.");
            }

        } catch (InputMismatchException e) {
            System.out.println("digite um número decimal para a temperatura.");
        }
    }
}