package exercicio4_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExercicio4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        final int MAX_CONTATOS = 10;

        int opcao;
        do {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar todos os contatos");
            System.out.println("3. Procurar contato por nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        if (contatos.size() < MAX_CONTATOS) {
                            System.out.print("Nome do contato: ");
                            String nome = scanner.nextLine();
                            System.out.print("Telefone do contato: ");
                            String telefone = scanner.nextLine();
                            System.out.print("Email do contato: ");
                            String email = scanner.nextLine();

                            contatos.add(new Contato(nome, telefone, email));
                            System.out.println("Contato adicionado com sucesso!");
                        } else {
                            System.out.println("A agenda está cheia (máximo de " + MAX_CONTATOS + " contatos).");
                        }
                        break;
                    case 2:
                        if (contatos.isEmpty()) {
                            System.out.println("Nenhum contato na agenda.");
                        } else {
                            System.out.println("\n Lista de Contatos ");
                            for (Contato c : contatos) {
                                System.out.println(c);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Digite o nome do contato para procurar: ");
                        String nomePesquisa = scanner.nextLine();
                        boolean encontrou = false;
                        for (Contato c : contatos) {
                            if (c.getNome().equalsIgnoreCase(nomePesquisa)) {
                                System.out.println("Contato encontrado:");
                                System.out.println("Telefone: " + c.getTelefone());
                                System.out.println("Email: " + c.getEmail());
                                encontrou = true;
                                break;
                            }
                        }
                        if (!encontrou) {
                            System.out.println("Contato não encontrado.");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo da agenda.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número para a opção.");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close();
    }
}