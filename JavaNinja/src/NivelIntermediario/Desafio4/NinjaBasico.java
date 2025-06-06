package NivelIntermediario.Desafio4;

import java.sql.SQLOutput;

public class NinjaBasico implements Ninja{

    String nome;
    String habilidade;
    int idade;

    public NinjaBasico(String nome, String habilidade, int idade){
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executar habilidade " + habilidade);

    }
}
