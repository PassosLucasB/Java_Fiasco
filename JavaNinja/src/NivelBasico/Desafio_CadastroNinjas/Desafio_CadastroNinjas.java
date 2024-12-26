package NivelBasico.Desafio_CadastroNinjas;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Desafio_CadastroNinjas {
    public static void main(String[] args) {

        /*
        * Crie um programa que represente três ninjas da Vila da Folha (Konoha) de "Naruto"
        * e suas respectivas missões.
        *
        * Cada ninja tem um nome, uma idade e uma missão atribuída a ele,
        * com nome da missão, nível de dificuldade e status de conclusão.
        *
        * */

        /*
        * 3 ninjas
        *
        * Objeto - Ninja
        * String nome
        * int idade
        * String missão
        *
        * Objeto - Missão
        * String nome
        * String nível de dificuldade
        * String status de conclusão
        * */

        String [] ninja = new String [3];
        String [] nomeNinja = new String [3];


        // Abriu Scanner
        Scanner scanner = new Scanner(System.in);

        int opEscolhida = 0;

        System.out.println("===== Menu de Ninjas =====");
        System.out.println("1. Cadastrar um Ninja");
        System.out.println("2. Listar Ninjas Cadastrados");
        System.out.println("3. Sair");
        System.out.println("Escolha uma opção para prosseguir: ");

        int opUsuario = scanner.nextInt();

        switch (opUsuario) {
            case 1:
                System.out.println("Você escolheu adicionar um novo Ninja!");
                break;
            case 2:
                System.out.println("LISTAR NINJAS - ADICIONAR LISTA AQUI");
                break;
            case 3:
                System.out.println("Você escolheu Sair e Encerrar");
                break;
            default:
                System.out.println("Você não escolheu uma alternativa válida! Tente novamente.");
        }

        String novoNome = scanner.nextLine(System.in);

        if (opEscolhida == 1){
            System.out.println("Digite o nome do Ninja a ser adicionado: ");
            String nomeNinja = novoNome.nextLine();
        }






        // Fechar o Scanner
        scanner.close();
    }
}

