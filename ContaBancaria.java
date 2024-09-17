package Projeto;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======Bem vindo ao Alura Bank======\n");
        String nome = "Johon Gomes";
        String tipoConta = "Corrente";
        double saldoInicial = 5.000;
        int opcao = 0;

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de Conta:" + tipoConta);
        System.out.printf("Saldo Inicial U$:%.3f%n ", saldoInicial);

        String menu = """
                \nDigite o número correspondente para acessar a função:
                [ 1 ] - Consultar seu saldo.
                [ 2 ] - Transferir um valor.
                [ 3 ] - Depósito / Receber um valor.
                [ 4 ] - Sair.
                """;

        while (opcao != 4){
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.printf("O seu saldo atual é de U$:%.3f%n", saldoInicial, "\n");
            } else if ( opcao == 2){
                System.out.println("Qual valor você deseja transferir / sacar ?");
                    double saque = sc.nextDouble();
                    if (saque > saldoInicial){
                        System.out.println("Não há saldo suficiente.");
                    }else{
                        saldoInicial -= saque;
                        System.out.println("Saque / transferência realizado com sucesso");
                        System.out.printf("Seu saldo atualizado é de U$:%.3f%n", saldoInicial);
                    }
            }else if ( opcao == 3 ){
                System.out.println("Qual valor você deseja depositar?");
                    double deposito = sc.nextDouble();
                    saldoInicial += deposito;
                    System.out.printf("Seu saldo atualizado é de U$:%.3f%n", saldoInicial);
            }else{
                System.out.println("Você escolheu uma opção inválida!");
            }
        }
        System.out.println("\nObrigado por usar o Alura Bank \n" +
                           "Você saiu do Aplicativo!");
    }
}
