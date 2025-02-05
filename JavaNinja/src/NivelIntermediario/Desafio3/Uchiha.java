package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

     public void mostrarHabilidadeEspecial(){
         System.out.println("A habilidade especial é: " + habilidadeEspecial + "!");
     }

     public void mostrarInformacoes(){
         System.out.println("O nome do Ninja é " + nome + " idade: "+ idade + " com a missão de " + missao +
                 " com a dificuldade " + nivelDificuldade + " no momento está " + statusMissao +
                         "a habilidade especial é " + habilidadeEspecial +"!");
     }
}
