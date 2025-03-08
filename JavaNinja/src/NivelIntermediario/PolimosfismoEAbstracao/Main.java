package NivelIntermediario.PolimosfismoEAbstracao;

public class Main {
    public static void main(String[] args) {

        // Obj ninja não pode ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;


        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
    }
}
