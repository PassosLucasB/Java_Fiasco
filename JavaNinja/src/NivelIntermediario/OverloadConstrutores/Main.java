package NivelIntermediario.OverloadConstrutores;


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
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj Uchiha2
        Uchiha itachi = new Uchiha("Itachi Uchira", "Aldeia da Folha", 27 );
        itachi.habilidadeEspecial();


    }
}
