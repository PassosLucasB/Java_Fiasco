package TiposDeDados;

import java.sql.SQLOutput;
import java.util.Locale;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
        * Dados não primitivos: String (serve para guardar nome), Array (serve para guardar uma lista de nomes),
        *  Class (serve para ), enum (serve para ).
        *
        * Objetivos: Criar um ninja, e atribuir métodos a ele.
        *
         */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta= nome.toUpperCase(); //ToUppercase vai colocar tudo em CAPSLOOK
        System.out.println("Esse texto esta em CAPSLOOK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta em normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); //ToLowerCase vai colocar tudo em caixa baixa/minusculo
        System.out.println(aldeiaEmCaixaBaixa);
    }
}
