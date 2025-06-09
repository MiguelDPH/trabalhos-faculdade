package exercicio4_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExercicio4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao;
        do {
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Calcular total de salários por departamento");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do funcionário: ");
                        String nome = scanner.nextLine();
                        System.out.print("ID do funcionário: ");
                        int id = scanner.nextInt();
                        System.out.print("Salário do funcionário: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Departamento do funcionário: ");
                        String departamento = scanner.nextLine();

                        funcionarios.add(new Funcionario(nome, id, salario, departamento));
                        System.out.println("Funcionário cadastrado com sucesso!");
                        break;
                    case 2:
                        System.out.print("Digite o nome do departamento para calcular o total de salários: ");
                        String deptPesquisa = scanner.nextLine();
                        double totalSalarios = 0;
                        boolean encontrouDepartamento = false;
                        for (Funcionario f : funcionarios) {
                            if (f.getDepartamento().equalsIgnoreCase(deptPesquisa)) {
                                totalSalarios += f.getSalario();
                                encontrouDepartamento = true;
                            }
                        }
                        if (encontrouDepartamento) {
                            System.out.printf("Total de salários para o departamento '%s': R$%.2f%n", deptPesquisa, totalSalarios);
                        } else {
                            System.out.println("Departamento não encontrado ou sem funcionários.");
                        }
                        break;
                    case 3:
                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado.");
                        } else {
                            System.out.println("\n Lista de Funcionários");
                            for (Funcionario f : funcionarios) {
                                System.out.println(f);
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número para a opção e valores corretos para os campos.");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close();
    }
}