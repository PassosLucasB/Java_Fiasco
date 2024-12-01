package NivelBasico.Desafio_1;

public class Desafio {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade1 = 14;
        String missao1 = "Encontrar o bandido";
        String statusDaMissao1 = "Em andamento";
        char nivelDaMissao1 = 'S';

        // Verificar nivel da missao e idade do ninja
        if (idade1 < 15) {
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D') {
                statusDaMissao1 = "Concluida";
            } else {
                statusDaMissao1 = "Não concluída, idade insuficiente";
            }
        } else {
            statusDaMissao1 = "Concluída";
        }


        System.out.println("Nome do ninja 1: " + nomeNinja1);
        System.out.println("Idade do ninja 1: " + idade1);
        System.out.println("Missão do ninja 1: " + missao1);
        System.out.println("Status da missão do ninja 1: " + statusDaMissao1);
        System.out.println("Nível da missão do ninja 1: " + nivelDaMissao1);
        System.out.println("---------------------------------------------------");


        // Ninja 2
        String nomeNinja2 = "Sasuku Uchiha";
        int idade2 = 9;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'D';

        // Verificar nivel da missao e idade do ninja
        if (idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Missão concluida";
            } else {
                statusDaMissao2 = "Missão não concluída, idade insuficiente";
            }
        } else {
            statusDaMissao2 = "Missão concluída, idade suficiente";
        }

        System.out.println("Nome do ninja 2: " + nomeNinja2);
        System.out.println("Idade do ninja 2: " + idade2);
        System.out.println("Missão do ninja 2: " + missao2);
        System.out.println("Status da missão do ninja 2: " + statusDaMissao2);
        System.out.println("Nível da missão do ninja 2: " + nivelDaMissao2);
        System.out.println("---------------------------------------------------");


        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar Feridos da guerra";
        String statusDaMissao3 = "Concluído";
        char nivelDaMissao3 = 'D';

        // Verificar nivel da missao e idade do ninja
        if (idade3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Missão concluida";
            } else {
                statusDaMissao3 = "Missão não concluída, idade insuficiente";
            }
        } else {
            statusDaMissao3 = "Missão concluída, idade suficiente";
        }


        System.out.println("Nome do ninja 3: " + nomeNinja3);
        System.out.println("Idade do ninja 3: " + idade3);
        System.out.println("Missão do ninja 3: " + missao3);
        System.out.println("Status da missão do ninja 3: " + statusDaMissao3);
        System.out.println("Nível da missão do ninja 3: " + nivelDaMissao3);
        System.out.println("---------------------------------------------------");


    }
}
