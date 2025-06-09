package exercicio1_2;

import java.util.Scanner;

public class MainExercicio1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificadorPalindromo verificador = new VerificadorPalindromo();


        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        if (verificador.ePalindromo(palavra)) {
            System.out.println("É um palindromo");
        } else {
            System.out.println("Não é um palindromo");
        }
    }
 }
