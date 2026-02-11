package NivelFacil.Desafio1;


public class Desafio1_Revisao {

/*  Crie um programa que represente três ninjas da Vila da Folha e suas respectivas missões.

    1 - Cada ninja tem um NOME, uma IDADE;
    2 - Uma MISSÃO atribuída a cada ninja, com o NOME DA MISSÃO, NÍVEL DE DIFICULDADE e STATUS DE CONCLUSÃO;
    3 - Altere o status da missão para "concluída" ou "não concluída" de acordo com a lógica e imprima o resultado;
    4 - Ninjas menores de 15 anos só podem concluir missões de nível C ou D.
*/

    public static void main(String[] args) {

        //Ninja 1
        String Nome_Ninja1 = "Adao";
        int Idade_Ninja1 = 14;
        String Missao1 = "Investigar";
        String Nivel_Missao1 = "D";
        String Status_Missao1 = "Concluída";

        // Verificação de nivel da missao e idade do ninja
        if (Idade_Ninja1 < 15) {
            if (Nivel_Missao1 == "C" || Nivel_Missao1 == "D") {
                Status_Missao1 = "Concluida";
            } else {
                Status_Missao1 = "Não concluída, idade insuficiente";
            }
        } else{
            Status_Missao1 = "Concluída";
        }


        System.out.println(Nome_Ninja1);
        System.out.println(Idade_Ninja1);
        System.out.println(Missao1);
        System.out.println(Nivel_Missao1);
        System.out.println(Status_Missao1);

        //Ninja 2
        String Nome_Ninja2 = "Bruno";
        int Idade_Ninja2 = 17;
        String Missao2 = "Atacar";
        String Nivel_Missao2 = "C";
        String Status_Missao2 = "Não Concluída";

        // Verificação de nivel da missao e idade do ninja
        if (Idade_Ninja2 < 15) {
            if (Nivel_Missao2 == "C" || Nivel_Missao2 == "D") {
                Status_Missao2 = "Concluida";
            } else {
                Status_Missao2 = "Não concluída, idade insuficiente";
            }
        } else {
            Status_Missao2 = "Concluída";
        }

        System.out.println(Nome_Ninja2);
        System.out.println(Idade_Ninja2);
        System.out.println(Missao2);
        System.out.println(Nivel_Missao2);
        System.out.println(Status_Missao2);

        //Ninja 3
        String Nome_Ninja3 = "Caio";
        int Idade_Ninja3 = 21;
        String Missao3 = "Se entregar";
        String Nivel_Missao3 = "B";
        String Status_Missao3 = "Concluída";

        // Verificação de nivel da missao e idade do ninja
        if (Idade_Ninja3 < 15) {
            if (Nivel_Missao3 == "C" || Nivel_Missao3 == "D") {
                Status_Missao3 = "Concluida";
            } else {
                Status_Missao3 = "Não concluída, idade insuficiente";
            }
        } else {
            Status_Missao3 = "Concluída";
        }


        System.out.println(Nome_Ninja3);
        System.out.println(Idade_Ninja3);
        System.out.println(Missao3);
        System.out.println(Nivel_Missao3);
        System.out.println(Status_Missao3);


    }



}
