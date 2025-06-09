package exercicio1_3;

import java.util.Scanner;

public class MainExercicio1_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        System.out.println("Digite um numero inteiro ");
        int numero = scanner.nextInt();

        int resultado = fatorial.calcularFatorial(numero);
        System.out.println("Seu numero fatorial é: " + resultado);
    }

}
