package Condicoes;

public class IfeElse {
    public static void main(String[] args) {

        /*
        *   IF e ELSE - Condições
        *   else if
        *   Objetivo: Passa o ninja de nível de acordo com o número de missões
         */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        /*
        *   if(condição) {resultado}
        *   else if (condição {resultado}
        *   else {resultado caso nada seja verdadeiro}
        *
         */



        // se(condição) {faça isso}

        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20 && idade > 15) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }

    }
}
