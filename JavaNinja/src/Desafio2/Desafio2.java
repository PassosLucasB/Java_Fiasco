package Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Fazer o array
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3){

            // MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas está cheia");
                    }
                    break;
            }
        }
    }
}
