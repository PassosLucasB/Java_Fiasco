package NivelIntermediario.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    // No args Constructor =  Construtor sem argumentos
    public Hokages() {
    }

    // Criar um construtor com argumentos
    public Hokages(String nome){
        this.nome =  nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    // All args constructor = Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hokages(double altura) {
        this.altura = altura;
    }

    // Você consegue criar os construtores automaticamente com o intelliJ
    public Hokages(int idade, String nome, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
