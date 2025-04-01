package NivelIntermediario.MemoriaRefVal;

import java.sql.SQLOutput;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 2.10;

    public Ninja(){

    }

    //TODO NINJA VAI FAZER OBRIGATORIAMENTE
    final void tacarKunai() {System.out.println("EU SOU UM METODO DA CLASSE MAE!");}

    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamado os novos atributos
    // Sobrecarga de metodos você n]ao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank){
       this(nome,aldeia, idade);
       this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
       this.rank = rank;
    }

    //Meotodo geral! Todos os ninjas vao ter
    public void habilidadeEspecial(){System.out.println("Meu nome é " + nome + " e esse é meu ataue especial");}

    //Sobrescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é " + nome + " Essa é minha ESTRATÉGIA de combate");
    }

    //Inteligencia de combate - Sobrecarga de metodos
    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130){
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }
    }

    //Metodo sem @Override
    public void motodoProvisorio(){
        System.out.println("teste na classe Ninja");
    }

    @Override
    public String toString(){
        return "Meu nome é " + nome + " eu sou da " + aldeia + " e tenho " + idade + " anos.";
    }





}
