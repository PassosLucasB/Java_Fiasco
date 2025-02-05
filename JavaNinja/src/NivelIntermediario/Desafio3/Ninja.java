package NivelIntermediario.Desafio3;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacores() {
        System.out.println("O nome do Ninja é " + nome + " idade: "+ idade + " com a missão de " + missao +
                " com a dificuldade " + nivelDificuldade + " no momento está " + statusMissao + "!");
    }
}
